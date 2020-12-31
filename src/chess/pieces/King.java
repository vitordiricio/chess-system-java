package chess.pieces;

import boardgame.Board;
import chess.Chesspiece;
import chess.Color;

public class King extends Chesspiece {

	public King(Board board, Color color) {
		super(board, color);
		
	}
	
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}

}
