package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Mgame {
    public int roundCnt;
    public int N;
    public ArrayList<Player> players;
    public Board board;
    public ArrayList<Die> dies;

    Mgame(int N, String[] names){
        this.N = N;
        players = new ArrayList<Player>();
        board = new Board();
        dies = new ArrayList<Die>(Arrays.asList(new Die(),new Die()));

        createPlayer(names);
    }

    void playGame(){
        System.out.println("\nStart the game!");
        for(roundCnt = 0; roundCnt<N ; roundCnt++){
            playRound();
        }
        System.out.println("\n****************************************************************");
        System.out.println("Game over ;(");
        System.out.println("****************************************************************");

    }

    void playRound(){
        int size = players.size();
        for(int i = 0 ;i<size;i++){
            System.out.println("----------------------------------------------------------------\n");
            System.out.println("Round: "+String.valueOf(roundCnt+1)+" ("+players.get(i).getName()+" turn!)\n");
            players.get(i).takeTurn();
            System.out.println("\n"+String.valueOf(i+1)+" of "+String.valueOf(size)+" players played");
        }
    }

    void createPlayer(String[] names){
        for(String name:names){
            players.add(new Player(name,dies, board));
        }
    }
}
