package org.example;

import java.util.ArrayList;

/**
 * Lerdphipat Kanjanarungroj
 * 6510450917
 */

public class Player {
    public Board board;
    public String name;
    public Piece piece;
    public ArrayList<Die> dies;

    Player(String name,ArrayList<Die> dies,Board board){
        this.name = name;
        this.dies = dies;
        this.board = board;
        piece = new Piece(board.getFristSquare());
    }

    void takeTurn(){

        int fvTot = 0;
        for(int i = 1;i<=dies.size();i++){
            dies.get(i-1).roll();
            int face = dies.get(i-1).getFaceValue();
            System.out.println(name+"'s "+((i-1 == 0)?"first":"second")+" dice roll landed on "+face);
            fvTot += face;
        }

        System.out.println(name+" rolled dices and got "+fvTot+", so "+name+" need to move forward "+fvTot+" squares\n");

        Square squareLoc = piece.getLocation();
        System.out.println("Currently square of "+name+"'s piece is "+squareLoc.getName());
        squareLoc = board.getSquare(squareLoc,fvTot);
        System.out.println(name+"'s piece is moving to "+squareLoc.getName()+" square");
        piece.setLocation(squareLoc);
        System.out.println();
    }

    public String getName() {
        return name;
    }
}
