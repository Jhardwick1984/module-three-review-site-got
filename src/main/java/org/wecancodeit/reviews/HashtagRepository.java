package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

public interface HashtagRepository extends CrudRepository<Hashtag,Long> {
   public Hashtag findByName(String name);
}
