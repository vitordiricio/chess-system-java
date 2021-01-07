package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class Chesspiece extends Piece {
	
	private Color color;

	public Chesspiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		Chesspiece p = (Chesspiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

	
	
	
}
