package org.wecancodeit.reviews;


import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.repos.HashtagRepository;

@Service
public class HashtagStorage {

    private HashtagRepository hashtagRepo;

    public HashtagStorage(HashtagRepository hashtagRepo){
        this.hashtagRepo = hashtagRepo;
    }

    public Hashtag retrieveHashtagById(Long id){
        return hashtagRepo.findById(id).get();
    }

    public void deleteHashtagById(Long id){
        hashtagRepo.deleteById(id);
    }

    public void saveHashtag(Hashtag hashtagToAdd){
        hashtagRepo.save(hashtagToAdd);
    }

    public Iterable<Hashtag> retrieveAllHashtags(){
        return hashtagRepo.findAll();
    }

    public Hashtag retrieveSingleHashtag(String name) {
        return hashtagRepo.findByName(name);
    }
}
