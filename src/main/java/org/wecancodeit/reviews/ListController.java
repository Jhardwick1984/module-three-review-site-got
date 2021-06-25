package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController<ListRepository> {

    //private ListRepository listRepo;
    private ListStorage listStorage;

    public ListController(ListStorage listStorageo) {
        this.listStorage = listStorageo;
    }

    @RequestMapping("list/{name}")
    public String displaySingleList(@PathVariable String name, Model model){

        List listToDisplay = listStorage.retrieveByName(name);
        model.addAttribute("list",listToDisplay);

        return "single-list";
    }

}
