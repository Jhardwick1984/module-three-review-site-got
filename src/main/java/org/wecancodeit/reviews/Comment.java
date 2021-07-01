package org.wecancodeit.reviews;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String usrname;
    private String comment;

    @ManyToOne
    private Anime anime;

    protected Comment() {

    }


    public Comment(String usrname, String comment, Anime anime) {
//        this.id = id;
        this.usrname = usrname;
        this.comment = comment;
        this.anime = anime;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return usrname;
    }

    public String getComment() {
        return comment;
    }

    public Anime getAnime() {
        return anime;
    }


    @Override
    public String toString() {
        return "Comment{" +
                "name='" + usrname + '\'' +
                ", comment='" + comment + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment1 = (Comment) o;
        return Objects.equals(id, comment1.id) && Objects.equals(usrname, comment1.usrname) && Objects.equals(comment, comment1.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usrname, comment);
    }
}


