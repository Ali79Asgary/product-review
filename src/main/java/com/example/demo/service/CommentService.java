package com.example.demo.service;

import com.example.demo.model.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getAllComments();

    Comment getCommentById(Long id);

    Comment saveComment(Comment comment);

    Comment updateComment(Long id, Comment newComment);

    void deleteCommentById(Long id);
}
