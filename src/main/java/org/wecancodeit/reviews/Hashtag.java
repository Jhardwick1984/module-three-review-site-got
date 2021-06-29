package org.wecancodeit.reviews;


import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

@Entity
public class Hashtag {

    @Id
    @GeneratedValue
    private Long id;
    private String name;




    @ManyToMany
    //@OneToMany
    private Collection<Anime> anime;

//    public void setHashtags(Collection<Hashtag> hashtags) {
//        this.hashtags = hashtags;
//    }


    protected Hashtag(){

    }

    public Hashtag(String name) {
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public Collection<Anime> getHashtags() { return anime; }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Hashtag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hashtag hashtag = (Hashtag) o;
        return Objects.equals(id, hashtag.id) && Objects.equals(name, hashtag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


}



