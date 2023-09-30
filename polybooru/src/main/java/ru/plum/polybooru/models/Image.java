package ru.plum.polybooru.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Image {
    private String name;
    private String extension;
    private Long size;
    private byte[] bytes;

}
