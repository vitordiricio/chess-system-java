package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.Chesspiece;
import chess.Color;

public class King extends Chesspiece {

	public King(Board board, Color color) {
		super(board, color);
		
	}
	
	public String toString() {
		return "K";
	}
	
	private boolean canMove(Position position) {
		Chesspiece p =  (Chesspiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		//acima 
		
		p.setValues(position.getRow() - 1, position.getColumn());;
		
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//abaixo
		
		p.setValues(position.getRow() + 1, position.getColumn());;
		
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//esquerda
		
		p.setValues(position.getRow(), position.getColumn() - 1);;
		
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//direita
		
		p.setValues(position.getRow(), position.getColumn() + 1);;
		
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//nw
		
		p.setValues(position.getRow() - 1, position.getColumn() - 1);;
		
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//ne
		
		p.setValues(position.getRow() - 1, position.getColumn() + 1);;
		
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//sw
		
		p.setValues(position.getRow() + 1, position.getColumn() - 1);;
		
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//se
		
		p.setValues(position.getRow() + 1, position.getColumn() + 1);;
		
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		return mat;
	}

}
