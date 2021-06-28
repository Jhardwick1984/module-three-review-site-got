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
    private Long Id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private Collection<Anime> anime;

    protected Category() {

    }

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

//    public void setAnime(Collection<Anime> anime) {
//        this.anime = anime;
//    }


    public String getName() { return name; }

    public String getDescription() {
        return description;
    }

    public Collection<Anime> getAnime() { return anime; }

    public Long getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(Id, category.Id) && Objects.equals(name, category.name) && Objects.equals(description, category.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, description);
    }
}
