//package org.wecancodeit.reviews;
//
//
//import javax.persistence.*;
//import java.util.Collection;
//import java.util.Set;
//
//@Entity
//public class List {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//    private String name;
//
//    @Lob
//    private String description;
//
//
//    @OneToMany(mappedBy = "list")
//
//    private Collection<List> lists;
//
//
//    protected List(){
//
//    }
//
//    public List(Long id, String name, String description, Set<List> lists) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.lists = lists;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//}
//
//
//
