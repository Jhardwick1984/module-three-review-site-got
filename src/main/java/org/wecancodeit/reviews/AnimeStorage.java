package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



@Service
    public class AnimeStorage {

   Map<String,Anime> animes;

   public AnimeStorage() {
       animes = new HashMap<>();
   }

    public void saveAnime(Anime anime){
        animes.put(anime.getTitle(), anime);
    }

   public Anime retrieveAnimeByTitle(String title) {
       return animes.get(title);
    }

    public Collection<Anime> retrieveAllAnime(){
       return animes.values();
    }

}
