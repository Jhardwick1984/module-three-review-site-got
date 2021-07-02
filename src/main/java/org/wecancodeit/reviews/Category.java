package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private String gifUrl;

    @OneToMany(mappedBy = "category")
    private Collection<Anime> anime;

    protected Category() {

    }

    public Category(String name, String description, String gifUrl) {
        this.name = name;
        this.description = description;
        this.gifUrl = gifUrl;
    }

    public String getName() { return name; }

    public String getDescription() {
        return description;
    }

    public String getGifUrl() { return gifUrl; }

    public Collection<Anime> getAnime() { return anime; }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", gifUrl='" + gifUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(name, category.name) && Objects.equals(description, category.description) && Objects.equals(gifUrl, category.gifUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, gifUrl);
    }
}
