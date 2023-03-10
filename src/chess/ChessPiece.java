package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Position postion, Board board, Color color) {
		super(postion, board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
		
}
