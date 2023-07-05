package com.example.demo.service;

import com.example.demo.model.Comment;
import com.example.demo.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    @Override
    public List<Comment> getAllComments() {
        return null;
    }

    @Override
    public Comment getCommentById(Long id) {
        return null;
    }

    @Override
    public Comment saveComment(Comment comment) {
        return null;
    }

    @Override
    public Comment updateComment(Long id, Comment newComment) {
        return null;
    }

    @Override
    public void deleteCommentById(Long id) {

    }
}
