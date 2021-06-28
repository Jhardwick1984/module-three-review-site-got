package org.wecancodeit.reviews;


import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class Hashtag {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Lob
    private String description;


    @OneToMany(mappedBy = "Hashtag")

    private Collection<Hashtag> hashtags;


    protected Hashtag(){

    }

    public Hashtag(Long id, String name, String description, Set<Hashtag> hashtags) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.hashtags = hashtags;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}



