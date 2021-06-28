package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HashtagController<HashtagRepository> {

    private HashtagStorage hashtagStorage;

    public HashtagController(HashtagStorage hashtagStorage) {
        this.hashtagStorage = hashtagStorage;
    }

    @RequestMapping("list/{name}")
    public String displaySingleHashtag(@PathVariable String name, Model model){

        Hashtag hashtagToDisplay = hashtagStorage.retrieveByName(name);
        model.addAttribute("hashtag",hashtagToDisplay);

        return "single-hashtag";
    }

}
