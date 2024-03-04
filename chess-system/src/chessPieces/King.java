package chessPieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color black) {
        super(board, black);
    }

    @Override
    public String toString() {
        return "K";
    }
}
