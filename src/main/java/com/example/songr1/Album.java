package com.example.songr1;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Album {
    private   String title;
    private  String artist;
    private  String imageUrl;
    private   int songCount;
    private  int length;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    public Album(String title, String artist, String imageUrl, int songCount, int length) {
        this.title = title;
        this.artist = artist;
        this.imageUrl=imageUrl;
        this.songCount = songCount;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLength() {
        return length;
    }
}
