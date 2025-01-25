package chess;

public class IsInsideBoard {
    boolean insideBoard(ChessPosition endPosition){
        return (endPosition.getRow() > 0 && endPosition.getRow() < 8 && endPosition.getColumn() > 0 && endPosition.getColumn() < 8);
    }
}

