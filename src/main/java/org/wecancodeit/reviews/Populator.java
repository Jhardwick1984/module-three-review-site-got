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
                "On a quest to get their bodies back to normal, Edward & Alphonse Elric, two young and gifted alchemists, get caught up in a whirlwind of action and mystery!",
                actionCategory);
        Anime actionAnime2 = new Anime("Soul Eater", "BONES Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx3588-CA8LE5gjm9Qx.png",
                "At the Shinigami technical schools for weapon meisters, Maka and her living weapon, Soul Eater quest to collect 99 evil souls, and 1 witch soul.",
                actionCategory);
        Anime actionAnime3 = new Anime("Goblin Slayer", "White Fox Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/nx101165-dVgOyGhEP4mB.jpg",
                "A brutal world where one missed step can cost you your life, a young priestess embarks on her" +
                        "first adventure to slay some goblins. After a tragic turn of events, she meets an adventurer known" +
                        "only as Goblin Slayer and she learns there's more to goblin slaying than she thought.", actionCategory);
        Anime dramaAnime1 = new Anime("Clannad", "Kyoto Animation Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx2167-GNYaoI8DTcx4.png",
                "High School delinquent Tomoya has taken to drifting through life aimlessly without any drive" +
                        "towards his future. One morning he encounters a strange girl who soon becomes close to him," +
                        "and changes his life forever.", dramaCategory);
        Anime dramaAnime2 = new Anime("Koe no Katachi", "Kyoto Animation Studio", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/nx20954-RYEF5mWglzV8.png",
                "As a child, Shouya was popular and well liked by his friends. After a new student, a deaf girl named" +
                        "Shouko Nishimiya, transferres into his class, he takes to bullying her, resulting in growing up" +
                        "an outcast and disliked, and in turn being bullied himself. Now grown, he seeks to make amends.",
                dramaCategory);
        Anime dramaAnime3 = new Anime("Ano Hi Mita Hana no Namae wo Bokutachi wa Mada Shiranai", "A-1 Pictures Studios",
                "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx9989-qCd2RgAL0P8I.png",
                "After a tragic event, Jinta Yadomi and his child-hood friends have grown apart. " +
                        "Dealing with ghosts of the past, he seeks to face the guilt of that day, and fix ties with his friends.",
                dramaCategory);
        Anime sliceOfLifeAnime1 = new Anime("K-on!", "Kyoto Animation Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx5680-Xh6B67KuZ2PU.png",
                "Yui Hirasawa, a young and care-free girl, begins her high school life with no direction." +
                        "When she decides it's time to change that, she joins the Light Music Club, and the friends" +
                        "and memories made along the way drive her forward.", sliceCategory);
        Anime sliceOfLifeAnime2 = new Anime("Demi-chan wa Kataritai", "A-1 Pictures Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx97592-2m8qtzJLuGY3.jpg",
                "Tetsuo Takahashi is a high school biology teacher with a big interest in Demi-humans." +
                        "When he discovers his school has three demis as students, plus one teacher, he sees his chance" +
                        "to learn as much as he can, while also helping them with their life problems.", sliceCategory);
        Anime sliceOfLifeAnime3 = new Anime("Acchi Kocchi", "AIC Studios", "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx12291-NKo7qYW674Wo.jpg",
                "Tsumiki and Io adventure through life just one day at a time.  Enjoying every day together with friends and class-mates.",
                sliceCategory);

        categoryStorage.saveCategory(horrorCategory);
        categoryStorage.saveCategory(actionCategory);
        categoryStorage.saveCategory(comedyCategory);
        categoryStorage.saveCategory(fantasyCategory);
        categoryStorage.saveCategory(dramaCategory);
        categoryStorage.saveCategory(sliceCategory);
        animeStorage.saveAnime(horrorAnime1);
        animeStorage.saveAnime(horrorAnime2);
        animeStorage.saveAnime(horrorAnime3);
        animeStorage.saveAnime(comedyAnime1);
        animeStorage.saveAnime(comedyAnime2);
        animeStorage.saveAnime(comedyAnime3);
        animeStorage.saveAnime(fantasyAnime1);
        animeStorage.saveAnime(fantasyAnime2);
        animeStorage.saveAnime(fantasyAnime3);
        animeStorage.saveAnime(actionAnime1);
        animeStorage.saveAnime(actionAnime2);
        animeStorage.saveAnime(actionAnime3);
        animeStorage.saveAnime(dramaAnime1);
        animeStorage.saveAnime(dramaAnime2);
        animeStorage.saveAnime(dramaAnime3);
        animeStorage.saveAnime(sliceOfLifeAnime1);
        animeStorage.saveAnime(sliceOfLifeAnime2);
        animeStorage.saveAnime(sliceOfLifeAnime3);

    }
}
