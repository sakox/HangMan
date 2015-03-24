/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sako
 */
public class main {

    public static void main(String[] args) {
        ArrayList<String> wordsList = new ArrayList<>();
        boolean playGame;

        System.out.println("Welcome to HangMan, want to play a game?");
        System.out.println("Yes/No ?");
        Scanner inputLine = new Scanner(System.in);
        String inputText = inputLine.nextLine();
        playGame = startGame(inputText);
        String randomWord = getRandomWord();
        System.out.println(randomWord);
    }

    private static boolean startGame(String inputText) {
        if (inputText.equalsIgnoreCase("yes") || inputText.equalsIgnoreCase("y")) {
            System.out.println("Lets Start!");
            return true;
        } else {
            System.out.println("Ok, come back later!");
            System.exit(0);
            return false;
        }
    }

    private static String getRandomWord(){
        ArrayList<String> list = new ArrayList<>();
        try (Scanner s = new Scanner(new File("Words.txt"))) {
            while (s.hasNext()) {
                list.add(s.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File can't be found!");
        }
        Random rnd = new Random();
        return list.get(rnd.nextInt(list.size()));
    }

}
