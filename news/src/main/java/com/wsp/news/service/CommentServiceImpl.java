package com.wsp.news.service;

import com.wsp.news.model.Comment;
import com.wsp.news.model.CommentDto;
import com.wsp.news.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements ICommentService{
    private CommentRepository repository;

    @Override
    public List<Comment> findAll() {
        return repository.findAll();
    }

    @Override
    public Comment addComment(String text) {
        Comment comment = Comment.builder()
                .text(text)
                .build();
        return repository.save(comment);
    }
}
