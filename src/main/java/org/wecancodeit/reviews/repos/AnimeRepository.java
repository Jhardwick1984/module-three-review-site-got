package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Anime;

public interface AnimeRepository extends CrudRepository<Anime, Long> {

}
