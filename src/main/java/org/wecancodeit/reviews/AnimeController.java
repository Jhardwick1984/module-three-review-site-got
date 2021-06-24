package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnimeController {

    private AnimeStorage animeStorage;

    public AnimeController(AnimeStorage animeStorage) {
        this.animeStorage = animeStorage;
    }


    @RequestMapping("/anime/{title}")


    public String displaySingleAnime(@PathVariable String title, Model model){

        Anime animeToDisplay = animeStorage.retrieveAnimeByTitle(title);
        model.addAttribute("anime", animeToDisplay);

        return "single-anime";
    }
}
