package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
	
	private Color color;
	
	private int moveCount;
	
	public ChessPiece() {
		
	}

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece cp = (ChessPiece) getBoard().piece(position);
		return cp != null && cp.getColor() != color;
	}
	
	protected void increaseCount() {
		moveCount++;
	}
	
	protected void decreaseCount() {
		moveCount--;
	}
}
