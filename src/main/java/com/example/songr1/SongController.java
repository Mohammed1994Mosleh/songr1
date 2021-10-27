package com.example.songr1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepo songRepoo;

    @Autowired
    AlbumRepo albumsRepository;

    @GetMapping("/Allsongs")
    public String getAllsong(Model model){
        model.addAttribute("songs",songRepoo.findAll());
        return "songs.html";
    }

    @PostMapping("/addsong")
    public RedirectView addSong(@RequestParam String title, Integer length , Integer  trackNumber , Integer id , Model model){
       
        }
    }

}
