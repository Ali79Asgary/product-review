package com.example.demo.service;

import com.example.demo.model.Comment;
import com.example.demo.model.Product;

import java.util.List;

public interface ReviewService {

    List<Product> getAllProductsByIsShowPublic(Boolean isShowPublic);

    List<Product> getAllProductsByIsCommentingActive(Boolean isCommentingActive);

    List<Product> getAllProductsByIsVotingActive(Boolean isVotingActive);

    List<Product> getAllProductsByIsCommentsAndVotesPublic(Boolean isCommentsAndVotesPublic);

    Boolean getIsShowPublicByProductId(Long id);

    Boolean getIsCommentingActiveByProductId(Long id);

    Boolean getIsVotingActiveByProductId(Long id);

    Boolean getIsCommentsAndVotesByProductId(Long id);

    Integer getCountOfComments();

    Double getAverageOfScores();

    List<Comment> getLast3CommentsByProductId(Long id);
}
