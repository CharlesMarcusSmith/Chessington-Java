package chessington.model.pieces;

import chessington.model.Board;
import chessington.model.Coordinates;
import chessington.model.Move;
import chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends AbstractPiece {
    public Pawn(PlayerColour colour) {
        super(Piece.PieceType.PAWN, colour);
    }

    @Override
    public List<Move> getAllowedMoves(Coordinates from, Board board) {
        if(this.colour == PlayerColour.WHITE){
            return allowedWhiteMoves(from, board);
        }
        else{
            return allowedBlackMoves(from, board);
        }
    }

    public List<Move> allowedWhiteMoves(Coordinates from, Board board){
        List<Move> allowedMoves = new ArrayList<>();

        //Coordinate objects to see potential move squares are populated with other pieces
        Coordinates moveOneAhead = from.plus(-1, 0);
        Coordinates moveTwoAhead = from.plus(-2, 0);


        if(board.get(moveOneAhead) == null){
            Move moveOne = new Move(from, moveOneAhead);
            allowedMoves.add(moveOne);

            //2 Moves on first move:
            if(board.get(moveTwoAhead) == null  && from.getRow() == 6){
                Move moveTwo = new Move(from, moveTwoAhead);
                allowedMoves.add(moveTwo);
            }
        }


        return allowedMoves;
    }

    public List<Move> allowedBlackMoves(Coordinates from, Board board){
        List<Move> allowedMoves = new ArrayList<>();

        Coordinates moveOneAhead = from.plus(1, 0);
        Coordinates moveTwoAhead = from.plus(2, 0);

        if(board.get(moveOneAhead) == null){
            Move moveOne = new Move(from, moveOneAhead);
            allowedMoves.add(moveOne);

            //2 Moves on first move:
            if(board.get(moveTwoAhead) == null && from.getRow() == 1){
                Move moveTwo = new Move(from, moveTwoAhead);
                allowedMoves.add(moveTwo);
            }
        }

        return allowedMoves;
    }
}
