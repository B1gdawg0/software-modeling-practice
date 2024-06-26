package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("How many players are in this game?: ");
            int numberPlayers = Integer.parseInt(scanner.nextLine());
            if(numberPlayers < 2){
                System.out.println("This game need at least 2 players");
            }else if(numberPlayers > 8){
                System.out.println("This game can't play more than 8 players");
            }else{
                String[] names = new String[numberPlayers];
                for(int i = 0;i<numberPlayers;i++){
                    System.out.print("Who is player NO."+String.valueOf(i+1)+": ");
                    String buffer = scanner.nextLine();
                    if(buffer.isEmpty()) i--;
                    else names[i] = buffer;
                }

                System.out.print("How many round y'all wanna play?: ");
                int round = Integer.parseInt(scanner.nextLine());;

                Mgame mgame = new Mgame(round,names);
                mgame.playGame();
            }
        }catch (InputMismatchException | NumberFormatException e){
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}