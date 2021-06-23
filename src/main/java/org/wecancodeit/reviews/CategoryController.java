package org.wecancodeit.reviews;


import jdk.jfr.Category;
import org.springframework.ui.Model;

public class CategoryController {

    private CategoryStorage category;
    private CategoryStorage categoryStorage;

    private CategoryController(CategoryStorage categoryStorage){
        this.category = categoryStorage;
    }

    public String displayAllCategories(Model model){

        Iterable<Category> allCategories = categoryStorage.retrieveAllCategories();
        model.addAttribute("categories", allCategories);

        return "all-category";

    }
}
