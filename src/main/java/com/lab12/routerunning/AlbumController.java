package com.lab12.routerunning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    public AlbumRepository albumRepo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public RedirectView navigateToAlbums(){
        return new RedirectView("/albums");
    }

    @RequestMapping(value = "/albums", method = RequestMethod.GET)
    public String getAllAlbums(Model m){
        m.addAttribute("albums", albumRepo.findAll());
        return "albums";
    }

    @RequestMapping(value = "/albums", method = RequestMethod.POST)
    public RedirectView createAlbums(@RequestParam String title,
                                     @RequestParam String artist,
                                     @RequestParam int songCount,
                                     @RequestParam int length){
        Album newAlbum = new Album(title, artist, songCount, length);
        albumRepo.save(newAlbum);
        return new RedirectView("/albums");
    }
}
