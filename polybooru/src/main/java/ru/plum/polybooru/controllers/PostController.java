package ru.plum.polybooru.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.plum.polybooru.dao.PostDAO;
import ru.plum.polybooru.models.Post;

@Controller
public class PostController {

    @GetMapping("/")
    public String hello() {
        return "test";
    }
}
