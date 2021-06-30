package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.reviews.repos.CommentRepository;

import java.util.Arrays;

@Controller
public class AnimeController {

    private AnimeStorage animeStorage;
    private CommentRepository commentRepo;

    public AnimeController(AnimeStorage animeStorage, CommentRepository commentRepo) {
        this.animeStorage = animeStorage;
        this.commentRepo = commentRepo;
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
                commentRepo.save(commentToDisplay);
                animeStorage.saveAnime(animeToDisplay);
        model.addAttribute("comment", commentToDisplay);



        model.addAttribute("anime", animeToDisplay);

        return "single-anime";
    }
}
