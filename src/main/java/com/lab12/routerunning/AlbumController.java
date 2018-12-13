package com.lab12.routerunning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlbumController {

    @RequestMapping(value = "/albums", method = RequestMethod.GET)
    public String getAllAlbums(Model m){

        Album[] albums = new Album[]{
                new Album("The Arrow", "Andy Mineo", 6, 25),
                new Album("All Things Work Together", "Lecrae", 12, 48)
        };

        m.addAttribute("albums", albums);
        return "albums";
    }
}
