package chess;

import java.util.Arrays;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard {

    private ChessPiece[][] board = new ChessPiece[8][8];

    public ChessBoard() {
        
    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece    the piece to add
     */
    public void addPiece(ChessPosition position, ChessPiece piece) {
        board[position.getRow() - 1][position.getColumn() - 1] = piece;
    }

    /**
     * Gets a chess piece on the chessboard
     *
     * @param position The position to get the piece from
     * @return Either the piece at the position, or null if no piece is at that
     * position
     */
    public ChessPiece getPiece(ChessPosition position) {
        return board[position.getRow() - 1][position.getColumn() - 1];
    }

    /**
     * Sets the board to the default starting board
     * (How the game of chess normally starts)
     */
    public void resetBoard() {
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                //Set major white pieces
                if(i == 0){
                    if(j == 0 || j == 7){ //Rook
                        ChessPosition tempPos = new ChessPosition(i + 1, j + 1);
                        ChessPiece tempPiece = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.ROOK);
                        addPiece(tempPos, tempPiece);
                    }else if(j == 1 || j == 6){ //Knight
                        ChessPosition tempPos = new ChessPosition(i + 1, j + 1);
                        ChessPiece tempPiece = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KNIGHT);
                        addPiece(tempPos, tempPiece);
                    }else if(j == 2|| j == 5){ //Bishop
                        ChessPosition tempPos = new ChessPosition(i + 1, j + 1);
                        ChessPiece tempPiece = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.BISHOP);
                        addPiece(tempPos, tempPiece);
                    }else if(j == 3){ //Queen
                        ChessPosition tempPos = new ChessPosition(i + 1, j + 1);
                        ChessPiece tempPiece = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.QUEEN);
                        addPiece(tempPos, tempPiece);
                    }else if(j == 4){ //King
                        ChessPosition tempPos = new ChessPosition(i + 1, j + 1);
                        ChessPiece tempPiece = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.KING);
                        addPiece(tempPos, tempPiece);
                    }

                }else if(i == 1){ //Set white pawns
                    ChessPosition tempPos = new ChessPosition(i + 1, j + 1);
                    ChessPiece tempPiece = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
                    addPiece(tempPos, tempPiece);
                }else if(i == 6){ //Set black pawns
                    ChessPosition tempPos = new ChessPosition(i + 1, j + 1);
                    ChessPiece tempPiece = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
                    addPiece(tempPos, tempPiece);
                }else if(i == 7){ //Set major black pieces
                    if(j == 0 || j == 7){ //Rook
                        ChessPosition tempPos = new ChessPosition(i + 1, j + 1);
                        ChessPiece tempPiece = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.ROOK);
                        addPiece(tempPos, tempPiece);
                    }else if(j == 1 || j == 6){ //Knight
                        ChessPosition tempPos = new ChessPosition(i + 1, j + 1);
                        ChessPiece tempPiece = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KNIGHT);
                        addPiece(tempPos, tempPiece);
                    }else if(j == 2 || j == 5){ //Bishop
                        ChessPosition tempPos = new ChessPosition(i + 1, j + 1);
                        ChessPiece tempPiece = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.BISHOP);
                        addPiece(tempPos, tempPiece);
                    }else if(j == 3){ //Queen
                        ChessPosition tempPos = new ChessPosition(i + 1, j + 1);
                        ChessPiece tempPiece = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.QUEEN);
                        addPiece(tempPos, tempPiece);
                    }else if(j == 4){ //King
                        ChessPosition tempPos = new ChessPosition(i + 1, j + 1);
                        ChessPiece tempPiece = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.KING);
                        addPiece(tempPos, tempPiece);
                    }
                }
            }
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.deepHashCode(board);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ChessBoard other = (ChessBoard) obj;
        if (!Arrays.deepEquals(board, other.board))
            return false;
        return true;
    }
}
