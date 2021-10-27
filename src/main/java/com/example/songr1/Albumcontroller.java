package com.example.songr1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;


@Controller
public class Albumcontroller {
    @Autowired
    AlbumRepo albumRepo;

    @GetMapping("/hello")
    @ResponseBody
    public String hello1(){
        return "hello world";
    }

    @GetMapping("/capitalize/{name}")
    @ResponseBody
    public String capitalize(@PathVariable String name){
        String returnString="";
        String [] returnCapitlized=name.split(" ");

        for(String word:returnCapitlized){
            String firstLetStr = word.substring(0, 1);
            String remLetStr = word.substring(1);
            firstLetStr = firstLetStr.toUpperCase();
            String firstLetterCapitalizedName = firstLetStr + remLetStr+" ";
            returnString+=firstLetterCapitalizedName;

        }

        return returnString;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/album")
    public String album(Model model){
        System.out.println("hi from get");
        model.addAttribute("albums",albumRepo.findAll());

        return "Albums.html";
    }

    @PostMapping("/AddAlbum")
    public RedirectView  addAlbums(@RequestParam(value = "title")String title,@RequestParam(value = "artist")String artist,
                            @RequestParam(value = "count")int count, @RequestParam(value = "length")int length,
                            @RequestParam(value = "image")String image){
        System.out.println("hello from post");

        Album album=new Album(title,artist,image,count ,length);


        albumRepo.save(album);

        return new RedirectView ("/album");


    }
}