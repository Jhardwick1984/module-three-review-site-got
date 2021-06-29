package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HashtagController{

    private HashtagStorage hashtagStorage;
    private HashtagStorage singleHashtag;

    public HashtagController(HashtagStorage hashtagStorage) {
        this.hashtagStorage = hashtagStorage;
    }

    @RequestMapping("/hashtag-section")

    public String displayAllHashtags(Model model){
        Iterable<Hashtag> allHashtags = hashtagStorage.retrieveAllHashtags();
        model.addAttribute("hashtags", allHashtags);

        return "all-hashtags";
    }


    @RequestMapping("/list/{name}")
    public String displaySingleHashtag(@PathVariable String name, Model model){

        Hashtag hashtag = hashtagStorage.retrieveSingleHashtag(name);
        model.addAttribute("hashtag",hashtag);

        return "single-hashtag";
    }

}
