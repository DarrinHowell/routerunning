package com.lab12.routerunning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    public AlbumRepository albumRepo;

    @RequestMapping(value = "/albums", method = RequestMethod.GET)
    public String getAllAlbums(Model m){

//        Album[] albums = new Album[]{
//                new Album("The Arrow", "Andy Mineo", 6, 25),
//                new Album("All Things Work Together", "Lecrae", 12, 48)
//        };
//
        m.addAttribute("albums", albumRepo.findAll());
        return "albums";
    }

    @RequestMapping(value = "/albums", method = RequestMethod.POST)
    public RedirectView createAlbums(){
        Album newAlbum = new Album("The Arrow", "Andy Mineo", 6, 25);
        albumRepo.save(newAlbum);
        return new RedirectView("/albums");
    }
}
