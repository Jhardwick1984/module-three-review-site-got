package org.wecancodeit.reviews;


import org.springframework.stereotype.Service;
//import org.wecancodeit.reviews.repos.ListRepository;

@Service
public class HashtagStorage {

    private HashtagRepository hashtagRepo;

    //dependency inj
    public HashtagStorage(HashtagRepository hashtagRepo){
        this.hashtagRepo = hashtagRepo;
    }

    public Hashtag retrieveByName(String name) {
        return hashtagRepo.findByName(name);
    }
}
