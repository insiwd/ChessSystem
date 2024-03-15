package application;
import chess.ChessMatch;
import application.UI;

public class App {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
