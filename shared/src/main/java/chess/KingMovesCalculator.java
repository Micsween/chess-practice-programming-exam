package chess;

import java.util.ArrayList;
import java.util.Collection;

public class KingMovesCalculator implements PieceMovesCalculator {
    IsInsideBoard isInsideBoard = new IsInsideBoard();
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition chessPosition, ChessPiece piece){
        Collection<ChessMove> moves = new ArrayList<ChessMove>();
        //move forward, diagonal up, diagona rught
        int row = chessPosition.getRow();
        int col = chessPosition.getColumn();
        int[][] possiblePositions= {
            {row + 1, col},
            {row + 1, col + 1},
            {row + 1, col - 1},
            {row, col - 1},
            {row, col+1},
            {row - 1, col},
            {row - 1, col + 1},
            {row - 1, col - 1},
        };
        for(int[] pos : possiblePositions) {
            ChessPosition endPosition = new ChessPosition(pos[0], pos[1]);
            if (isInsideBoard.insideBoard(endPosition) && (board.getPiece(endPosition) == null || (board.getPiece(endPosition) != null && board.getPiece(endPosition).pieceColor() != piece.getTeamColor()))) {
                moves.add(new ChessMove(chessPosition, endPosition, null));
            }
        }
        return moves;
    }

}
