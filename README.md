NOTES FROM MY FIRST TIME TAKING THE PRACTICE EXAM.
make chess positiona  record and override the getter methods with getROw adn getCol

chesspiece, et.c record
chessboard: ChessPiece[9][9]
 getters and initialization with default chesspieces
## REMIND YOURSELF HOW INTERFACES WORK ADN WHAT THEY LOOK LIKE
## variable (condition) ? expressioniftrue: expression iffalse
## move calculator interface:
## special switch statement
logic for piecemove: if(is inside board && (board(endposition) == null || board(endPosition != null && endposition piece.color != piece.color)
THE ONLY PIECE THAT NEEDS SPECIFIC BLACK/WHITE case is pawn.
knight: basic move set with for loop checking if each move is valid
king same thing. different move set

ALL OF THESE USE ROWMODIFIERS/COLModifiers
rook: while(is inside board) check if it can move forward, breaking if theres a piece there. add move if the piece is of opposite team color. one method for rowmove, 
one method for column move()
bishop: same thing but the moveset is diagonal
queen: a combination of bishop and rook

pawn:
switch statement for WHITE/BLACk in pieceMoves() method
isfirst move()?
forward method
diagonal method() if there is an enemy piece in a diagonal forward position

> [!IMPORTANT] 
> PRACTICE THIS

```
        PieceMovesCalculator moves = switch (piece.getPieceType()){
            case PAWN -> new PawnMovesCalculator();
            case KING -> new KingMovesCalculator();
            case QUEEN -> new QueenMovesCalculator();
            case BISHOP -> new BishopMovesCalculator();
            case KNIGHT -> new KnightMovesCalculator();
            case ROOK -> new RookMovesCalculator();
        };
        return moves.pieceMoves(board, myPosition, piece);
```
