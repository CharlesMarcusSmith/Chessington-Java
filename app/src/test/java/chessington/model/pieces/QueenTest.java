package chessington.model.pieces;

import chessington.model.Board;
import chessington.model.Coordinates;
import chessington.model.PlayerColour;
import chessington.model.Move;
import java.util.ArrayList;
import java.util.List;

import static chessington.model.pieces.PieceAssert.*;
import static org.assertj.core.api.Assertions.*;

public class QueenTest {

//    (row, col)
//    (0,0) = BlackRook ... (0,7)
//    ...
//    [0,1,2,Q,K,5,6,7]
//    ...
//    7,0 = White Rook...(7,7)

    //Eight Moves Only:
    public void whiteQueenCanMoveEightSquaresUpRow() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(7, 3);
        board.placePiece(coords, queen);

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(0,3)));
    }

    public void whiteQueenCanMoveEightSquaresDownRow() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(0, 3);
        board.placePiece(coords, queen);

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(7,3)));
    }

    public void whiteQueenCanMoveEightSquaresColumnLeft() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(4, 7);
        board.placePiece(coords, queen);

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(4,0)));
    }

    public void whiteQueenCanMoveEightSquaresColumnRight() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(4, 0);
        board.placePiece(coords, queen);

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(4,7)));
    }

    public void blackQueenCanMoveEightSquaresDownRow() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(7, 3);
        board.placePiece(coords, queen);

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(0,3)));
    }

    public void blackQueenCanMoveEightSquaresUpRow() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(0, 3);
        board.placePiece(coords, queen);

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(7,3)));
    }

    public void blackQueenCanMoveEightSquaresLeftColumn() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(4, 7);
        board.placePiece(coords, queen);

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(4,0)));
    }

    public void blackQueenCanMoveEightSquaresRightColumn() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(4, 0);
        board.placePiece(coords, queen);

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(4,7)));
    }


    //Up To Eight Moves Only:
    public void whiteQueenCanMoveUpToEightSquaresUpRow() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(7, 3);
        board.placePiece(coords, queen);
        List<Move> expectedMoves = List.of(
                coords.plus(6, 3),
                coords.plus(5,3),
                coords.plus(4,3),
                coords.plus(3,3),
                coords.plus(2,3),
                coords.plus(1,3),
                coords.plus(0,3);
        );

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(0,3)));
    }

    public void whiteQueenCanMoveUpToEightDownSquaresRow() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(0, 3);
        board.placePiece(coords, queen);
        List<Move> expectedMoves = List.of(
                coords.plus(7,3),
                coords.plus(6, 3),
                coords.plus(5,3),
                coords.plus(4,3),
                coords.plus(3,3),
                coords.plus(2,3),
                coords.plus(1,3);
        );

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(0,3)));
    }

    public void whiteQueenCanMoveUpToEightSquaresColumnLeft() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(4, 7);
        board.placePiece(coords, queen);
        List<Move> expectedMoves = List.of(
                coords.plus(6, 3),
                coords.plus(5,3),
                coords.plus(4,3),
                coords.plus(3,3),
                coords.plus(2,3),
                coords.plus(1,3);
                coords.plus(0,3);
        );

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(0,3)));
    }

    public void whiteQueenCanMoveUpToEightSquaresColumnRight() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.WHITE);
        Coordinates coords = new Coordinates(4, 0);
        board.placePiece(coords, queen);
        List<Move> expectedMoves = List.of(
                coords.plus(4,3),
        );

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(0,3)));
    }

    public void blackQueenCanMoveUpToEightDownSquaresRow() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.BLACK);
        Coordinates coords = new Coordinates(0, 3);
        board.placePiece(coords, queen);
        List<Move> expectedMoves = new ArrayList<>();

        for(int i = 0; i < expectedMoves.size()-1; i++){
            Move move = new Move(coords,coords.plus(i, 3));
            expectedMoves.add(move);
        }

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(0,3)));
    }

    public void blackQueenCanMoveUpToEightSquaresUpRow() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.BLACK);
        Coordinates coords = new Coordinates(7, 3);
        board.placePiece(coords, queen);
        List<Move> expectedMoves = new ArrayList<>();

        for(int i = 7; i < expectedMoves.size()+1; i--){
            Move move = new Move(coords,coords.plus(i, 3));
            expectedMoves.add(move);
        }

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(0,3)));
    }

    public void blackQueenCanMoveUpToEightSquaresLeftColumn() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.BLACK);
        Coordinates coords = new Coordinates(4, 7);
        board.placePiece(coords, queen);
        List<Move> expectedMoves = new ArrayList<>();

        for(int i = 0; i < expectedMoves.size()-1; i++){
            Move move = new Move(coords,coords.plus(4, i));
            expectedMoves.add(move);
        }

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(0,3)));
    }

    public void blackQueenCanMoveUpToEightSquaresColumnRight() {
        // Arrange:
        Board board = Board.empty();
        Piece queen = new Queen(PlayerColour.BLACK);
        Coordinates coords = new Coordinates(4, 0);
        board.placePiece(coords, queen);
        List<Move> expectedMoves = new ArrayList<>();

        for(int i = 0; i < expectedMoves.size()-1; i++){
            Move move = new Move(coords,coords.plus(4, i));
            expectedMoves.add(move);
        }

        // Act:
        List<Move> moves = queen.getAllowedMoves(coords, board);

        // Assert
        assertThat(moves).contains(new Move(coords,coords.plus(0,3)));
    }


}
