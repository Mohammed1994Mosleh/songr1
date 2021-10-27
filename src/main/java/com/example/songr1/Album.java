package com.example.songr1;


import javax.persistence.*;
import java.util.ArrayList;

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
    @OneToMany(mappedBy = "songAlbum")
    ArrayList <Song> albumSong=new ArrayList<>();


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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean getSongCount() {
    }
}
