package ru.plum.polybooru.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Autowired
    @Transient
    private Image image;
    private String author;
    private Date date;
    @Autowired
    @Transient
    private ArrayList<Tag> tags;

    public Post(long id, Image image, String author, Date date) {
        this.id = id;
        this.image = image;
        this.author = author;
        this.date = date;
    }
}
