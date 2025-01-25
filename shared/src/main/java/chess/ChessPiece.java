package chess;

import java.util.Collection;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public record ChessPiece (ChessGame.TeamColor pieceColor, ChessPiece.PieceType type){
    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
       return pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        ChessPiece piece = board.getPiece(myPosition);
        PieceMovesCalculator movesCalculator = switch (piece.getPieceType()){
            case ROOK -> new KingMovesCalculator();
            case KNIGHT -> new KingMovesCalculator();
            case BISHOP -> new KingMovesCalculator();
            case KING -> new KingMovesCalculator();
            case QUEEN -> new KingMovesCalculator();
            case PAWN -> new KingMovesCalculator();
        };
        return movesCalculator.pieceMoves(board, myPosition, piece);
    }
}
