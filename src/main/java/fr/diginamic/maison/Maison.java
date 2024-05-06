package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.List;

public class Maison {
    private List<Piece> pieces;

    public Maison() {
        pieces = new ArrayList<>();
    }

    public void ajouterPiece(Piece piece) {
    	if (piece == null) {
    		throw new IllegalArgumentException("La pièce ne peut pas etre null.");
    	}
        pieces.add(piece);
    }

    public double superficieTotale() {
        double total = 0;
        for (Piece piece : pieces) {
            total += piece.getSuperficie();
        }
        return total;
    }

    public double superficieTotalePieceType(String type) {
        double total = 0;
        for (Piece piece : pieces) {
            if (piece.getClass().getSimpleName().equals(type)) {
                total += piece.getSuperficie();
            }
        }
        return total;
    }

    public double superficieEtage(int etage) {
        double total = 0;
        for (Piece piece : pieces) {
            if (piece.getEtage() == etage) {
                total += piece.getSuperficie();
            }
        }
        return total;
    }
    public int nombrePiecesType(String type) {
        int count = 0;
        for (Piece piece : pieces) {
            if (piece.getClass().getSimpleName().equals(type)) {
                count++;
            }
        }
        return count;
    }
}