package org.wecancodeit.reviews;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

public class AnimeController {
    private AnimeStorage animeStorage;

    public AnimeController(AnimeStorage animeStorage){
        this.animeStorage = animeStorage;
    }

    public String displaySingleAnime(@PathVariable String title, Model model){

        Anime animeToDisplay = animeStorage.retrieveAnimeByTitle(title);
        model.addAttribute("Anime", animeToDisplay);

        return "single-anime";
    }
}
