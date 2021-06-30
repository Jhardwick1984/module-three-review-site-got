package org.wecancodeit.reviews;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

@Entity
public class Anime {
    
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String studioName;
    private String imageUrlAddress;
    private String description;


    @ManyToOne
    private Category category;

    @ManyToMany
    private Collection<Hashtag> hashtags;

    @OneToMany
    private Collection<Comment> comment;

    protected Anime() {

    }


    public Anime(String inTitle, String inStudioName, String imageUrlAddress, String description, Category category, Hashtag... hashtags){
    this.title = inTitle;
    this.studioName = inStudioName;
    this.imageUrlAddress = imageUrlAddress;
    this.description = description;
    this.category = category;
    this.hashtags = Set.of(hashtags);
    }

    public String getTitle() {
        return title;
    }

    public String getStudioName() {
        return studioName;
    }

    public String getImageUrlAddress() {
        return imageUrlAddress;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() { return category; }

    public Collection<Hashtag> getHashtag() { return hashtags; }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", studioName='" + studioName + '\'' +
                ", imageUrlAddress='" + imageUrlAddress + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return Objects.equals(id, anime.id) && Objects.equals(title, anime.title) && Objects.equals(studioName, anime.studioName) && Objects.equals(imageUrlAddress, anime.imageUrlAddress) && Objects.equals(description, anime.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, studioName, imageUrlAddress, description);
    }
}
