package ru.plum.polybooru.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.plum.polybooru.models.Image;
import ru.plum.polybooru.models.Post;
import ru.plum.polybooru.models.Tag;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class PostDAO implements DAO<Post>{

    private List<Post> posts;

    public Optional<Post> get(long id) {
        return posts.stream().filter(post -> post.getId() == id).findAny();
    }

    @Override
    public List<Post> getAll() {
        return posts;
    }

    @Override
    public void save(Post post) {

    }

    @Override
    public void update(Post post, String[] params) {

    }

    @Override
    public void delete(Post post) {

    }

}
