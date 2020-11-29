package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public Chesspiece[][] getPieces(){
		Chesspiece[][] mat = new Chesspiece[board.getRows()][board.getColumns()];
		for(int i = 0;i<board.getRows();i++) {
			for(int j = 0; j<board.getColumns();j++) {
				mat[i][j] = (Chesspiece) board.piece(i,j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, Chesspiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		board.placePiece(new Rook(board, Color.WHITE), new Position(3,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
	}
}
