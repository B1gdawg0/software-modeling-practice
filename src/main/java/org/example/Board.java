package org.example;

import java.util.ArrayList;

public class Board {
    public ArrayList<Square> squares;

    Board(){
        squares = new ArrayList<Square>();
        createBoard();
    }

    public Square getSquare(Square square, int fvTot){
        return squares.get((square.getIndex()+fvTot)%40);
    }

    public Square getFristSquare(){
        return  squares.get(0);
    }

    public void createBoard(){
        String[] names = {"A","B","C","D"};
        for(int i = 0;i<4;i++){
            for(int j = 0;j<10;j++) squares.add(new Square(names[i]+String.valueOf(j), i*10+j));
        }
    }
}
