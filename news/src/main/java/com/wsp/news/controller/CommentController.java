package com.wsp.news.controller;

import com.wsp.news.model.Comment;
import com.wsp.news.model.CommentDto;
import com.wsp.news.repository.CommentRepository;
import com.wsp.news.service.ICommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/comments")
@CrossOrigin(origins = "http://localhost:4200")
public class CommentController {
    private CommentRepository repository;
    private ICommentService service;

    @PostMapping(path = "/add")
    public Comment addComment(@RequestBody String text) {
        return this.service.addComment(text);
    }

    @GetMapping
    public List<Comment> loadAll(){
        return this.service.findAll();
    }
}
