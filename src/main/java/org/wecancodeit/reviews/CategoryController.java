package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    public class CategoryController {

//    private CategoryStorage category;
    private CategoryStorage categoryStorage;

    private CategoryController(CategoryStorage categoryStorage){
        this.categoryStorage = categoryStorage;
    }

    @RequestMapping("/HomePage")

    public String displayAllCategories(Model model){
        Iterable<Category> allCategories = categoryStorage.retrieveAllCategories();
        model.addAttribute("categories", allCategories);

        return "all-categories";
    }
}
