/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sako
 */
public class main {
    public static void main(String[] args){
        ArrayList<String> wordsList = new ArrayList<>();
        boolean playGame;
        
        System.out.println("Welcome to HangMan, want to play a game?");
        System.out.println("Yes/No ?");
        Scanner inputLine = new Scanner(System.in);
        String inputText = inputLine.nextLine();
        playGame = startGame(inputText);
        String randomWord = getRandomWord();
    }

    private static boolean startGame(String inputText) {
        if(inputText.equalsIgnoreCase("yes") || inputText.equalsIgnoreCase("y")){
            System.out.println("Lets Start!");
            return true;
        } else{
            System.out.println("Ok, come back later!");
            System.exit(0);
            return false;
        }
    }

    private static String getRandomWord() {
        
    }
    
}
