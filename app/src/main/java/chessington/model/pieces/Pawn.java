package chessington.model.pieces;

import chessington.model.*;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends AbstractPiece {
    public Pawn(PlayerColour colour) {
        super(Piece.PieceType.PAWN, colour);
    }

    @Override
    public List<Move> getAllowedMoves(Coordinates from, Board board) {
        List<Move> allowedMoves = new ArrayList<>();
        int rowDistanceAllowed = 1;
        int multiplier;  //Manipulate distance based on colour.

        if(!this.getFirstMoveMade()){
            rowDistanceAllowed = 2;
        }
        if(this.colour == PlayerColour.WHITE){
            multiplier = -1;
        } else {
            multiplier = 1;
        }
        for(int i = 1; i<=rowDistanceAllowed; i++){
            Coordinates to = from.plus(i * multiplier, 0);
            if(to.coordsValid(to) && board.get(to) == null){
                Move move = new Move(from, to);
                allowedMoves.add(move);
            }
            else {
                break;
            }
        }
        return allowedMoves;
    }




//    public List<Move> allowedBlackMoves(Coordinates from, Board board){
//        List<Move> allowedMoves = new ArrayList<>();
//
//        Coordinates moveOneAhead = from.plus(1, 0);
//        Coordinates moveTwoAhead = from.plus(2, 0);
//
//        if(board.get(moveOneAhead) == null){
//            Move moveOne = new Move(from, moveOneAhead);
//            allowedMoves.add(moveOne);
//
//            //2 Moves on first move:
//            if(board.get(moveTwoAhead) == null && from.getRow() == 1){
//                Move moveTwo = new Move(from, moveTwoAhead);
//                allowedMoves.add(moveTwo);
//            }
//        }
//
//        return allowedMoves;
//    }
}
