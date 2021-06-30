package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HashtagController{

    private HashtagStorage hashtagStorage;
    private HashtagStorage singleHashtag;
    private AnimeStorage animeStorage;

    public HashtagController(HashtagStorage hashtagStorage, AnimeStorage animeStorage) {
        this.hashtagStorage = hashtagStorage;
        this.animeStorage = animeStorage;
    }

    @RequestMapping("/hashtag-section")

    public String displayAllHashtags(Model model){
        Iterable<Hashtag> allHashtags = hashtagStorage.retrieveAllHashtags();
        model.addAttribute("hashtags", allHashtags);

        return "all-hashtags";
    }


    @RequestMapping("/list/{name}")
    public String displaySingleHashtag(@PathVariable String name, String title, Model model){


//        Anime animeToDisplay = animeStorage.retrieveSingleAnime(title);
//        model.addAttribute("anime", animeToDisplay);
//
//        Iterable<Anime> allAnime = animeStorage.retrieveAllAnime();
//        model.addAttribute("anime", allAnime);

        Hashtag hashtag = hashtagStorage.retrieveSingleHashtag(name);
        model.addAttribute("hashtag", hashtag);

        return "single-hashtag";
    }
}
