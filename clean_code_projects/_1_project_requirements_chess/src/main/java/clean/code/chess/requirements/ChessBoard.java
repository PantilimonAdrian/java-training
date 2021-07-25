package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (IsLegalBoardPosition(xCoordinate, yCoordinate)
                && pieces[xCoordinate][yCoordinate] == null
                && IsLegalColorPosition(xCoordinate, pieceColor)) {
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pieces[xCoordinate][yCoordinate] = pawn;
        } else {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }
    }

    public boolean IsLegalColorPosition(int xCoordinate, PieceColor pieceColor) {
        if (pieceColor.equals(PieceColor.WHITE)) {
            return (xCoordinate == 0 || xCoordinate == 1);
        }
        return (xCoordinate == MAX_BOARD_WIDTH - 1 || xCoordinate == MAX_BOARD_WIDTH);
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return (xCoordinate >= 0 && yCoordinate >= 0 && xCoordinate < MAX_BOARD_WIDTH && yCoordinate < MAX_BOARD_HEIGHT);
    }

    public boolean checkColor(int newX, int newY, PieceColor color) {
        return pieces[newX][newY].getPieceColor() == color;
    }
}
