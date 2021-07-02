package org.wecancodeit.reviews.repos;

import org.apache.catalina.startup.ContextRuleSet;
import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    Category findByName(String name);
}
