package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Anime;
import org.wecancodeit.reviews.Comment;


public interface AnimeRepository extends CrudRepository<Anime,Long> {
    Anime findByTitle(String title);
}
