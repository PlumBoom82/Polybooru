package ru.plum.polybooru.models;

import java.util.ArrayList;
import java.util.Date;

public class Post {
    private Long id;
    private Image image;
    private String author;
    private ArrayList<Tag> tags;
    private Date date;

    public Post(Long id, Image image, String author, ArrayList<Tag> tags, Date date) {
        this.id = id;
        this.image = image;
        this.author = author;
        this.tags = tags;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public Image getImage() {
        return image;
    }

    public String getAuthor() {
        return author;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public Date getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
