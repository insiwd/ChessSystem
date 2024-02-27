package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    //apenas o get pois a cor de uma peça não pode ser facilmente mudada
    public Color getColor() {
        return color;
    }
}
