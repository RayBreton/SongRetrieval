/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw05;

/**
 *
 * @author Raynier
 */
public class Song {

    private String title;
    private String artist;
    private String year;

    public Song(String a, String t, String y) {
        title = t;
        artist = a;
        year = y;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String toString() {
        return artist + " : " + title + " : " + year;

    }

}
