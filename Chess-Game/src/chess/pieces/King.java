package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	// Standard Constructor
	public King() {

	}

	// Constructor Using fields
	public King(Board board, Color color) {
		super(board, color);
	}

	// Method toString
	@Override
	public String toString() {
		return "K";
	}

}
