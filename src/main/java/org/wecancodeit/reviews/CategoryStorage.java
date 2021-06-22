package org.wecancodeit.reviews;

import jdk.jfr.Category;

public class CategoryStorage {
    private CategoryRepository categoryRepo;

    public CategoryStorage(CategoryRepository categoryRepo){
        this.categoryRepo = categoryRepo;
    }

    public Category retrieveCategoryById(Long id){
        return categoryRepo.findById(id).get();
    }

    public void deleteCategoryById(Long id){
        categoryRepo.deleteById(id);
    }

    public saveCategory(Category categoryToAdd){
        categoryRepo.save(categoryToAdd);
    }

    public Iterable<Category> retrieveAllCategories(){
        return categoryRepo.findAll;
    }


}
