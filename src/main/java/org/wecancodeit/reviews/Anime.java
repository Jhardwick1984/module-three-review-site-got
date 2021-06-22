package org.wecancodeit.reviews;


import jdk.jfr.Category;

public class Anime {
    private String title;
    private String studioName;
    private String imageUrlAddress;
    private String description;
    private Category category;

    public Anime(String inTitle, String inStudioName, String imageUrlAddress, String description, Category category){
    this.title = inTitle;
    this.studioName = inStudioName;
    this.imageUrlAddress = imageUrlAddress;
    this.description = description;
    this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getStudioName() {
        return studioName;
    }

    public Category getCategory() {
        return category;
    }

    public String getImageUrlAddress() {
        return imageUrlAddress;
    }

    public String getDescription() {
        return description;
    }
}
