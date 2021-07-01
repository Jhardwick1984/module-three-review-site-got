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
    private HashtagRepository hashtagRepo;

    public AnimeController(AnimeStorage animeStorage, CommentRepository commentRepo, HashtagRepository hashtagRepo) {
        this.animeStorage = animeStorage;
        this.commentRepo = commentRepo;
        this.hashtagRepo = hashtagRepo;
    }


    @GetMapping("/anime/{title}")


    public String displaySingleAnime(@PathVariable String title, Model model){

        Anime animeToDisplay = animeStorage.retrieveSingleAnime(title);
        model.addAttribute("anime", animeToDisplay);

        return "single-anime";
    }

    @PostMapping("/anime/{title}")

    public String addCommentToAnime(@PathVariable String title, Model model, String usrname, String comment, String hashtags){
        Anime animeToDisplay = animeStorage.retrieveSingleAnime(title);
        Comment commentToDisplay = new Comment(usrname, comment, animeToDisplay);
        Hashtag hashtagToAdd = new Hashtag(hashtags);
                hashtagRepo.save(hashtagToAdd);
                commentRepo.save(commentToDisplay);
                animeStorage.saveAnime(animeToDisplay);
        model.addAttribute("comment", commentToDisplay);
        model.addAttribute("hashtags", hashtagToAdd);


        model.addAttribute("anime", animeToDisplay);

        return "single-anime";
    }

//    @PostMapping("/anime/{title}")
//
//    public String addHashtagToAnime(@PathVariable String title, Model model, String hashtags){
//        Anime animeToDisplay = animeStorage.retrieveSingleAnime(title);
//        Hashtag hashtagToAdd = new Hashtag(hashtags);
//            hashtagRepo.save(hashtagToAdd);
//            animeStorage.saveAnime(animeToDisplay);
//        model.addAttribute("hashtag", hashtagToAdd);
//
//        model.addAttribute("anime", animeToDisplay);
//
//        return "single-anime";
//
//    }
}
