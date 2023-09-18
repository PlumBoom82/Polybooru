package ru.plum.polybooru.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Post {
    private long id;
    private Image image;
    private String author;
    private ArrayList<Tag> tags;
    private Date date;

}
