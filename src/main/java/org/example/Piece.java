package org.example;

/**
 * Lerdphipat Kanjanarungroj
 * 6510450917
 */

public class Piece {
    private Square square;

    Piece(Square square){
        this.square = square;
    }

    public Square getLocation(){
        return square;
    }

    public void setLocation(Square square){
        this.square = square;
    }
}
