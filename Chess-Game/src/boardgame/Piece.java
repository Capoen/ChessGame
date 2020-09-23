package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	// Standard Constructor
	public Piece() {

	}

	// Constructor Using Fields
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// Getters and Setters
	protected Board getBoard() {
		return board;
	}

}
