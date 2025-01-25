package chess;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard {
    ChessPiece[][] board;
    public ChessBoard() {
        this.board = new ChessPiece[9][9];
    }
    public void addPiece(ChessPosition position, ChessPiece piece) {
        this.board[position.getRow()][position.getColumn()] = piece;
    }
    public ChessPiece getPiece(ChessPosition position) {
        return this.board[position.getRow()][position.getColumn()];
    }

    /**
     * Sets the board to the default starting board
     * (How the game of chess normally starts)
     */
    void addRooks(){
        //white Rooks:
    }
    //works
    void addPawns(){
        for(int col = 1; col < 9; col++){
            addPiece(new ChessPosition(1,col), new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN));
            addPiece(new ChessPosition(7,col), new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN));
        }

    }
    public void resetBoard() {
        addPawns();

    }
}
