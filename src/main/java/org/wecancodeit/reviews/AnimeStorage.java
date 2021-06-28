package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.repos.AnimeRepository;
import org.wecancodeit.reviews.repos.CategoryRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



@Service
    public class AnimeStorage {

    private AnimeRepository animeRepo;

    public AnimeStorage(AnimeRepository animeRepo){
        this.animeRepo = animeRepo;
    }

    public Anime retrieveAnimeById(Long id){
        return animeRepo.findById(id).get();
    }

    public void deleteAnimeById(Long id){
        animeRepo.deleteById(id);
    }

    public void saveAnime(Anime animeToAdd){
        animeRepo.save(animeToAdd);
    }

    public Iterable<Anime> retrieveAllAnime(){
        return animeRepo.findAll();
    }

    public Anime retrieveSingleAnime(String title) {
        return animeRepo.findByTitle(title);
    }
//   Map<String,Anime> animes;

//   public AnimeStorage() {
//       animes = new HashMap<>();
//   }
//
//    public void saveAnime(Anime anime){
//        animes.put(anime.getTitle(), anime);
//    }
//
//   public Anime retrieveAnimeByTitle(String title) {
//       return animes.get(title);
//    }
//
//    public Collection<Anime> retrieveAllAnime(){
//       return animes.values();
//    }

}
