package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.repos.AnimeRepository;

@Component
public class Populator implements CommandLineRunner {
    private AnimeRepository animeRepository;
    private CategoryStorage categoryStorage;

    public Populator(AnimeRepository animeRepository, CategoryStorage categoryStorage) {
        this.animeRepository = animeRepository;
        this.categoryStorage = categoryStorage;
    }

    @Override
    public void run(String... args) throws Exception {
        Category horrorCategory = new Category("Horror", "These titles are scary, gory, or slightly disturbing!");
        Category comedyCategory = new Category("Comedy", "Guaranteed to give you a good chuckle!");
        Category fantasyCategory = new Category("Fantasy", "Dragons, swords, magic. We got them all!");
        Category actionCategory = new Category("Action", "So action-packed!");
        Category dramaCategory = new Category("Drama", "These will get you right in the feels, bring tissues!");
        Category sliceCategory = new Category("Slice of Life", "Wholesome, warm and fuzzy.");



        Anime horrorAnime1 = new Anime("Another", "P.A. Works Studio",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx11111-Y4QgkX8gJQCa.png",
                "High school students suffer from a terrible, class-wide curse. The new kid in class finds out the hard way.",
                horrorCategory);
        Anime horrorAnime2 = new Anime("Corpse-Party", "Asread Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/medium/b15037-3f0LKcbv4tM2.jpg",
                "Nine friends get sucked into an alternate reality containing a haunted elementary school. They're forced to break the curse before suffering horrible deaths!",
                horrorCategory);
        Anime horrorAnime3 = new Anime("Deadman Wonderland", "Manglobe Studio", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx6880-4aWqFNTwzqp0.png",
                "After being framed for a horrible crime, Ganta is sentenced to life inside the prison/theme park Deadman Wonderland.  He soons finds all it's dark secrets!",
                horrorCategory);
        Anime comedyAnime1 = new Anime("Chuunibyou demo Koi ga Shitai!", "Kyoto Animation Studio", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/nx14741-MI3STWwE0bQH.jpg",
                "Yuuta Togashi is ready for a normal high school life, but his hopes are soon dashed when he meets class-mate Rikka Takanashi.", comedyCategory);
        Anime comedyAnime2 = new Anime("Kobayashi-san Chi no Maidragon", "Kyoto Animation Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx21776-FJiPcLQHeTiV.png",
                "Miss Kobayashi drunkenly stumbles upon a dragon of all things one night, only to wake up one morning with her moving in as a maid!", comedyCategory);
        Anime comedyAnime3 = new Anime("One-Piece!", "Toei Animation Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/nx21-tXMN3Y20PIL9.jpg",
                "Monkey D. Luffy defies the standard definition of Pirate. Seeking only adventure, interesting people, and finding One Piece!", comedyCategory);
        Anime fantasyAnime1 = new Anime("Berserk (1997)", "OLM Studio", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx33-CTtcRjqe7UnM.jpg",
                "Guts is a lone mercenary on a mission for revenge.  This series will follow the Golden Age arc, showing us Guts' past and what lead to his current life!",
                fantasyCategory);
        Anime fantasyAnime2 = new Anime("Dungeon ni Deai wo Motomeru no wa Machigatteiru Darou ka", "J.C. Staff Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx20920-3x2KtyeYQmaR.jpg",
                "In a world where adventurers descend into a great dungeon to gain skills and level up their status, follow Bell Cranel.  A young adventurer seeking not just power, but a girlfriend!",
                fantasyCategory);
        Anime fantasyAnime3 = new Anime("Kono Subarashii Sekai ni Shukufuku wo!", "Studio DEEN", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx21202-TfzXuWQf2oLQ.png",
                "Kazuma Satou suddenly perishes one day, only to wake up in a fantasy world with a goddess. Now he must raise his status as an adventurer just to make it by in this new world!",
                fantasyCategory);
        Anime actionAnime1 = new Anime("Full Metal Alchemist: Brotherhood", "BONES Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx121-JUlbsyhTUNkk.png",
                "Brothers Edward and Alphonse Elric, two young alchemists, embark on a journey to find the philosopher stone, only to find so much more.",
                actionCategory);
        Anime actionAnime2 = new Anime("Soul Eater", "BONES Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx3588-CA8LE5gjm9Qx.png",
                "At the Shinigami technical schools for weapon meisters, Maka and her living weapon, Soul Eater quest to collect 99 evil souls, and 1 witch soul.",
                actionCategory);
        Anime actionAnime3 = new Anime("Goblin Slayer", "White Fox Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/nx101165-dVgOyGhEP4mB.jpg",
                "A young priestess teams up with an adventurer to delve into the dark task of goblin slaying.", actionCategory);
        Anime dramaAnime1 = new Anime("Clannad", "Kyoto Animation Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx2167-GNYaoI8DTcx4.png",
                "High School delinquent Tomoya has his life changed with an encounter with a young class-mate."
                        , dramaCategory);
        Anime dramaAnime2 = new Anime("Koe no Katachi", "Kyoto Animation Studio", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/nx20954-RYEF5mWglzV8.png",
                "Shoya Ishida seeks to make amends for the bullying for a young class-mate when he was a child.",
                dramaCategory);
        Anime dramaAnime3 = new Anime("Ano Hi Mita Hana no Namae wo Bokutachi wa Mada Shiranai", "A-1 Pictures Studios",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx9989-qCd2RgAL0P8I.png",
                "After a tragic event, Jinta Yadomi and his child-hood friends have grown apart. " +
                        "Dealing with ghosts of the past, he seeks to face the guilt of that day, and fix ties with his friends.",
                dramaCategory);
        Anime sliceOfLifeAnime1 = new Anime("K-on!", "Kyoto Animation Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx5680-Xh6B67KuZ2PU.png",
                "Yui Hirasawa, a young and care-free girl, begins her high school life with no direction," +
                        "until she decides to join the light music club!", sliceCategory);
        Anime sliceOfLifeAnime2 = new Anime("Demi-chan wa Kataritai", "A-1 Pictures Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx97592-2m8qtzJLuGY3.jpg",
                "Tetsuo Takahashi is a high school biology teacher with a big interest in Demi-humans, and their day to day lives!", sliceCategory);
        Anime sliceOfLifeAnime3 = new Anime("Acchi Kocchi", "AIC Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx12291-NKo7qYW674Wo.jpg",
                "Tsumiki and Io adventure through life just one day at a time.  Enjoying every day together with friends and class-mates.",
                sliceCategory);

        categoryStorage.saveCategory(horrorCategory);
        categoryStorage.saveCategory(actionCategory);
        categoryStorage.saveCategory(comedyCategory);
        categoryStorage.saveCategory(fantasyCategory);
        categoryStorage.saveCategory(dramaCategory);
        categoryStorage.saveCategory(sliceCategory);
        animeRepository.save(horrorAnime1);
        animeRepository.save(horrorAnime2);
        animeRepository.save(horrorAnime3);
        animeRepository.save(comedyAnime1);
        animeRepository.save(comedyAnime2);
        animeRepository.save(comedyAnime3);
        animeRepository.save(fantasyAnime1);
        animeRepository.save(fantasyAnime2);
        animeRepository.save(fantasyAnime3);
        animeRepository.save(actionAnime1);
        animeRepository.save(actionAnime2);
        animeRepository.save(actionAnime3);
        animeRepository.save(dramaAnime1);
        animeRepository.save(dramaAnime2);
        animeRepository.save(dramaAnime3);
        animeRepository.save(sliceOfLifeAnime1);
        animeRepository.save(sliceOfLifeAnime2);
        animeRepository.save(sliceOfLifeAnime3);

    }
}
