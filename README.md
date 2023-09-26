# Chessington

1. Fork this repo: click `Fork` in the top-right of the page - this will create a copy of this repo in **your own GitHub account**

2. Clone (download) the repo
    * Go to your newly-created fork of the repo (on GitHub).
    * Click `Clone or download` (the green button on the right).
    * Make sure the page says `Clone with SSH` (rather than `Clone with HTTPS`).
    * Open your git client (e.g. GitKraken) and use this link to clone the repo.  
    Your trainer will able to help you with this.

3. "Cloning the repo" will create a folder on your computer with the files from this repo.  
Open this folder in Visual Studio Code.

4. Open a command-prompt in this same folder.  
Your trainer can show you how to do this, if you need any help.

5. Run this command to run your code:  
`./gradlew run`

6. Run this command to run your tests:  
   `./gradlew test`

Refactor 'Smelly Code' notes:
- Where I have used a nested ifs which compares the same condition with different values, John has used a for loops --> I repeated code.
- Where I put conditionals for position of piece to check if first move made, John has moved this functionality outside of class, so can be used by other pieces (Rook and King for castling).
^ This is good practice at the refactor stage even if we don't know it's going to be used.
- Where I have set coordinate variables for the 4 potential pawn moves, John has used a Distance variable and for loop mentioned above --> Saves repeated code

Refactor change log:
- Added firstMoveMade boolean to AbstractPiece class and Piece interface.
- Set firstMoveMade method sets to true, as event only occurs once and can't be undone.
  ^ To be used for conditionals for pawn(2 spaces ahead); rook and king (Castling).
- Added functionality to the move() method inside of Board, which updates the boolean firstMoveMade in Piece to true.
  ^ This HAS to be done before the piece is moved position or before set to null, as we are pointing to the object within that Array index.
  ^ This is the reason we cant call a Piece piece object to call the method, we have to call the method from within the array.

- Removed Coordinate variables for moves and replaced them with int Distance.
- Using the new getFirstMoveMade method inside of abstractPiece to change pawn distance from 1 to 2.

- Using the plus() method in the Coordinates class to change coordinates while incoorperating the multiplier.

- Added coodsValid() method to coordinates to test if the coordinates in question are on the board.

- Break out of loop if another piece is encountered.
