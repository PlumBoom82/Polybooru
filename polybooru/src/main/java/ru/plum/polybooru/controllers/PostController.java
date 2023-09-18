package ru.plum.polybooru.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.plum.polybooru.dao.PostDAO;
import ru.plum.polybooru.models.Post;

//@Controller
@RestController
public class PostController {

    @GetMapping("/")
    public ResponseEntity hello() {
        return new ResponseEntity<>("{}", HttpStatusCode.valueOf(200));
    }
}
