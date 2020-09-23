package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

	// Atributes
	private Color color;

	// Standard Constructor
	public ChessPiece() {

	}

	// Constructor using fields
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	// Getters and Setters
	public Color getColor() {
		return color;
	}

}
