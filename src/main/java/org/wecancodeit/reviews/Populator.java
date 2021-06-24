package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    private AnimeStorage animeStorage;
    private CategoryStorage categoryStorage;

    public Populator(AnimeStorage animeStorage, CategoryStorage categoryStorage) {
        this.animeStorage = animeStorage;
        this.categoryStorage = categoryStorage;
    }

    @Override
    public void run(String... args) throws Exception {
        Category horrorCategory = new Category("Horror", "Scary");
        Category comedyCategory = new Category("Comedy", "Funny Ha-ha");
        Category fantasyCategory = new Category("Fantasy", "Dragons!");
        Category actionCategory = new Category("Action", "Explosions!");
        Category dramaCategory = new Category("Drama", "Right in the feels.");
        Category sliceCategory = new Category("Slice of Life", "Wholesome, warm and fuzzy.");
        Anime sampleAnime = new Anime("Another", "P.A. Works Studio",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx11111-Y4QgkX8gJQCa.png",
                "High school students suffer from a terrible, class-wide curse. The new kid in class finds out the hard way.",
                horrorCategory);
        categoryStorage.saveCategory(horrorCategory);
        categoryStorage.saveCategory(actionCategory);
        categoryStorage.saveCategory(comedyCategory);
        categoryStorage.saveCategory(fantasyCategory);
        categoryStorage.saveCategory(dramaCategory);
        categoryStorage.saveCategory(sliceCategory);
        animeStorage.saveAnime(sampleAnime);
    }
}
