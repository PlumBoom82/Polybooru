package ru.plum.polybooru.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@AllArgsConstructor
@Getter
@Setter
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String value;
    @Autowired
    @Transient
    private List<Post> posts;
}
