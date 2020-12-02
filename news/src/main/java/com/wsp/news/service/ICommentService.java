package com.wsp.news.service;

import com.wsp.news.model.Comment;
import com.wsp.news.model.CommentDto;

import java.util.List;

public interface ICommentService {
    List<Comment> findAll();
    Comment addComment(String text);
}
