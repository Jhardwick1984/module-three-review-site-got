package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
