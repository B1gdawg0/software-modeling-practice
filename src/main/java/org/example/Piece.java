package org.example;

public class Piece {
    public  Square square;

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
