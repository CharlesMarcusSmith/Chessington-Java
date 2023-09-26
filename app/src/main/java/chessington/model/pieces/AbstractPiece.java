package chessington.model.pieces;

import chessington.model.PlayerColour;

public abstract class AbstractPiece implements Piece {

    protected final Piece.PieceType type;
    protected final PlayerColour colour;
    protected boolean firstMoveMade;

    protected AbstractPiece(Piece.PieceType type, PlayerColour colour) {
        this.type = type;
        this.colour = colour;
        this.firstMoveMade = false;
    }

    @Override
    public Piece.PieceType getType() {
        return type;
    }

    @Override
    public PlayerColour getColour() {
        return colour;
    }

    public boolean getFirstMoveMade(){
        return firstMoveMade;
    }

    @Override
    public String toString() {
        return colour.toString() + " " + type.toString();
    }

    @Override
    public void setFirstMoveMade() {
        firstMoveMade = true;
    }
}
