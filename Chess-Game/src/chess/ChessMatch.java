package chess;

import boardgame.Board;

public class ChessMatch {

	// Atributes
	private Board board;

	// Standard Constructor
	public ChessMatch() {
		board = new Board(8, 8);
	}

	// Constructor Using Fields
	public ChessMatch(Board board) {
		this.board = board;
	}

	// Methods
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

}
