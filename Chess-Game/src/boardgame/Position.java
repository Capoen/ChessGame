package boardgame;

public class Position {

	// Atributes
	private Integer row;
	private Integer column;

	// Standard Constructor
	public Position() {

	}

	// Constructor Using Fields
	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	// Getters and Setters
	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return this.row + ", " + this.column;
	}

}
