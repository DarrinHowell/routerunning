package com.lab12.routerunning;

import java.nio.file.Path;

public class Album {
    private String title;
    private String artist;
    private int songCount;
    private int length;
    private Path imageURL;

    public Album(String title, String artist, int songCount, int length) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURL = null;
    }

    public String toString(){
        return "Album title: " + this.title + " Album artist: " + this.artist + " Song count: " + this.songCount;
    }
}
