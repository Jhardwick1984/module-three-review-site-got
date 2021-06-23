package org.wecancodeit.reviews;

import java.util.HashMap;
import java.util.Map;




public class AnimeStorage {

   Map<String,Anime> animes;

   public AnimeStorage(){
       animes = new HashMap<>();
   }

   public Anime retrieveAnimeByTitle(String title) {
       return animes.get(title);
    }

    public void saveAnime(Anime anime){
       animes.put(anime.getTitle(), anime);
    }
}
