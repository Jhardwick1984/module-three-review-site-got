package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.repos.CategoryRepository;

@Service
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

    public void saveCategory(Category categoryToAdd){
        categoryRepo.save(categoryToAdd);
    }

    public Iterable<Category> retrieveAllCategories(){
        return categoryRepo.findAll();
    }


    public Iterable<Category> retrieveSingleCategory() {
        return categoryRepo.findAll();
    }
}
