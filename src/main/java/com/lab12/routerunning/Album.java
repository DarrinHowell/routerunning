package com.lab12.routerunning;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.nio.file.Path;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String artist;
    private int songCount;
    private int length;
//    private Path imageURL;

    public Album(String title, String artist, int songCount, int length) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
//        this.imageURL = null;
    }

    public Album() {}

    public String toString(){
        return "Album title: " + this.title + ". Album artist: " + this.artist + ". Song count: " + this.songCount + ".";
    }
}
