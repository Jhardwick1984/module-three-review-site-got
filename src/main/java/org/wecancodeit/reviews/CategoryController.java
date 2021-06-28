package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    public class CategoryController {

//    private CategoryStorage category;
    private CategoryStorage categoryStorage;
        private CategoryStorage singleCategory;

        private CategoryController(CategoryStorage categoryStorage){
        this.categoryStorage = categoryStorage;
    }

    @RequestMapping("/HomePage")

    public String displayAllCategories(Model model){
        Iterable<Category> allCategories = categoryStorage.retrieveAllCategories();
        model.addAttribute("categories", allCategories);

        return "all-categories";
    }
    @RequestMapping("/categories/{name}")
    public String displaySingleCategory(@PathVariable String name, Model model){
        Category category = categoryStorage.retrieveSingleCategory(name);

        model.addAttribute("category", category);

        return "single-category";
    }

}
