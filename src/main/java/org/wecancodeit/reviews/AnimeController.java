package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.reviews.repos.CommentRepository;
import org.wecancodeit.reviews.repos.HashtagRepository;

import java.util.Arrays;

@Controller
public class AnimeController {

    private AnimeStorage animeStorage;
    private CommentRepository commentRepo;
    private HashtagStorage hashtagStorage;

    public AnimeController(AnimeStorage animeStorage, CommentRepository commentRepo, HashtagStorage hashtagStorage) {
        this.animeStorage = animeStorage;
        this.commentRepo = commentRepo;
        this.hashtagStorage = hashtagStorage;
    }


    @GetMapping("/anime/{title}")


    public String displaySingleAnime(@PathVariable String title, Model model){

        Anime animeToDisplay = animeStorage.retrieveSingleAnime(title);
        model.addAttribute("anime", animeToDisplay);

        return "single-anime";
    }

    @PostMapping("/anime/{title}")

    public String addCommentToAnime(@PathVariable String title, Model model, String usrname, String comment){
        Anime animeToDisplay = animeStorage.retrieveSingleAnime(title);
        Comment commentToDisplay = new Comment(usrname, comment, animeToDisplay);
        animeToDisplay.addComment(commentToDisplay);
                commentRepo.save(commentToDisplay);
                animeStorage.saveAnime(animeToDisplay);
        model.addAttribute("comment", commentToDisplay);
        model.addAttribute("anime", animeToDisplay);

        return "single-anime";
    }

    @PostMapping("/anime/hashtags/{title}")
    public String addHashtagToAnime(@PathVariable String title, Model model, String hashtags){
        Anime animeToDisplay = animeStorage.retrieveSingleAnime(title);
        Hashtag existingHashtag = hashtagStorage.retrieveSingleHashtag(hashtags);
        if(existingHashtag == null) {
            Hashtag hashtagToAdd = new Hashtag(hashtags);
            animeToDisplay.addHashtag(hashtagToAdd);
            hashtagStorage.saveHashtag(hashtagToAdd);
        }
        else {
            animeToDisplay.addHashtag(existingHashtag);
            hashtagStorage.saveHashtag(existingHashtag);
        }

        animeStorage.saveAnime(animeToDisplay);

        model.addAttribute("anime", animeToDisplay);

        return "single-anime";
    }

}
