package chess;

import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            // gerando erros
            throw new ChessException("Erro! Valores válidos são de a1 até h8.");
        }
        this.column = column;
        this.row = row;
    }

    // get & set, mas apagamos o set porque
    // a linha e coluna não podem ser
    // livremente mudadas

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());

    }

    @Override
    public String toString() {
        // " " para concatenar
        return "" + column + row;
    }
}

