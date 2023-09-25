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
        List<Move> allowedMoves = new ArrayList<>();
        if(this.colour == PlayerColour.WHITE){
            // WHITE MOVE OPTIONS
            Coordinates moveOneAhead = from.plus(-1, 0);

            if(board.get(moveOneAhead) == null){
                Move move = new Move(from, moveOneAhead);
                allowedMoves.add(move);
            }
        }
        else{
            // BLACK MOVE OPTIONS
            Coordinates moveOneAhead = from.plus(1, 0);
            if(board.get(moveOneAhead) == null){
                Move move = new Move(from, moveOneAhead);
                allowedMoves.add(move);
            }
        }

        return allowedMoves;
    }
}
