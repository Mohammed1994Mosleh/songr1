package com.example.songr1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;


@Controller
public class Songrcontroller {
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
        ArrayList <Album> music=new ArrayList<>();
        String img1Url="https://quotefancy.com/media/wallpaper/3840x2160/1370772-Roberta-Flack-Quote-The-first-time-ever-I-saw-your-face-I-thought.jpg";
        String img2Url="https://upload.wikimedia.org/wikipedia/en/thumb/9/90/Survivor_I_Can%27t_Hold_Back_Single.jpg/220px-Survivor_I_Can%27t_Hold_Back_Single.jpg";
        String img3Url="https://www.albayan.ae/polopoly_fs/1.4262443.1633360672!/image/image.jpg";
        Album album1=new Album("firsttime","roberta",img1Url,2,3);
        Album album2=new Album("icantholdback","Frankie",img2Url,4,5);
        Album album3=new Album("Quolee-ohibk","Kadem-Al-Saher",img3Url,10,5);
        music.add(album1);
        music.add(album2);
        music.add(album3);
        model.addAttribute("albums",music);
        return "home";
    }




}