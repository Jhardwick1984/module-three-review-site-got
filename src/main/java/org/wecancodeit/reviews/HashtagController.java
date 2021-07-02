package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.repos.HashtagRepository;

@Controller
public class HashtagController{

    private HashtagStorage hashtagStorage;
    private HashtagStorage singleHashtag;
    private AnimeStorage animeStorage;
    private HashtagRepository hashtagRepo;

    public HashtagController(HashtagStorage hashtagStorage, AnimeStorage animeStorage, HashtagRepository hashtagRepo) {
        this.hashtagStorage = hashtagStorage;
        this.animeStorage = animeStorage;
        this.hashtagRepo = hashtagRepo;
    }

    @RequestMapping("/hashtag-section")

    public String displayAllHashtags(Model model){

        Iterable<Hashtag> allHashtags = hashtagStorage.retrieveAllHashtags();
        model.addAttribute("hashtags", allHashtags);

        return "all-hashtags";
    }


    @GetMapping("/list/{name}")
    public String displaySingleHashtag(@PathVariable String name, String title, Model model){

        Hashtag hashtag = hashtagStorage.retrieveSingleHashtag(name);
        model.addAttribute("hashtag", hashtag);

        return "single-hashtag";
    }

        @PostMapping("/list/{name}")

    public String addHashtagToAnime(@PathVariable String title, Model model, String hashtags){
        Anime animeToDisplay = animeStorage.retrieveSingleAnime(title);
        Hashtag existingHashtag = hashtagStorage.retrieveSingleHashtag(hashtags);


        model.addAttribute("anime", animeToDisplay);

        return "single-hashtag";

    }
}
