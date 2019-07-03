package chess.pieces;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
private ChessMatch chessMatch;
	
	public Rook(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
	}

	@Override
	public String toString() {
		return "R";
	}
	
}
