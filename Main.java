/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Raynier
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        File input = new File("songs.csv");
        Scanner sc = new Scanner(input);
        Scanner kb = new Scanner(System.in);
        String userInput, userTitle, userArtist, line;
        int linecount = 0;
        
        //Song Array that holds 4456
        Song[] database = new Song[4456];
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] temp = line.split(",");
            Song song1 = new Song(temp[0], temp[1], temp[2]);
            database[linecount] = song1;
            linecount++;
        }
        System.out.println("Welcome to the Music Database");

        System.out.println("Enter a search command (title, artist) or quit:");
        userInput = kb.nextLine();

        while (!userInput.equals("quit")) {
            if (userInput.equals("title")) {
                System.out.println("enter a word or phrase in the title:");
                userTitle = kb.nextLine();

                for (int i = 0; i < database.length; i++) {

                    if (database[i] != null) {
                        if (database[i].getTitle().indexOf(userTitle) != -1) {
                            System.out.println(database[i].toString());
                        }
                    }
                }
            } else if (userInput.equals("artist")) {
                System.out.println("enter part or all of the artist name:");
                userArtist = kb.nextLine();

                for (int i = 0; i < database.length; i++) {

                    if (database[i] != null) {
                        if (database[i].getArtist().indexOf(userArtist) != -1) {
                            System.out.println(database[i].toString());
                        }
                    }
                }
            } else {
                System.out.println("Unknown command");
            }
            System.out.println("Enter a search command (title, artist) or quit:");
            userInput = kb.nextLine();
        }
        
        System.out.println("Closing the Music Database");
    }
}
