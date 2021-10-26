package com.example.songr1;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private   String title;
    private  String artist;
    private  String image;
    private   int count;
    private  int length;



    public Album(){

    }

    public Album(String title, String artist, String image, int count, int length) {
        this.title = title;
        this.artist = artist;
        this.image=image;
        this.count = count;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getImageUrl() {
        return image;
    }

    public int getSongCount() {
        return count;
    }

    public int getLength() {
        return length;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setImageUrl(String image) {
        this.image = image;
    }

    public void setSongCount(int count) {
        this.count = count;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
