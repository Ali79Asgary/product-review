package com.example.demo.service;

import com.example.demo.enumeration.CommentStatus;
import com.example.demo.enumeration.VoteStatus;
import com.example.demo.model.Comment;
import com.example.demo.model.Product;
import com.example.demo.model.Vote;
import com.example.demo.repository.CommentRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.VoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ProductRepository productRepository;

    private final CommentRepository commentRepository;

    private final VoteRepository voteRepository;

    @Override
    public List<Product> getAllProductsByIsShowPublic(Boolean isShowPublic) {
        return productRepository.findAllByIsShowPublic(isShowPublic);
    }

    @Override
    public List<Product> getAllProductsByIsCommentingActive(Boolean isCommentingActive) {
        return productRepository.findAllByIsCommentingActive(isCommentingActive);
    }

    @Override
    public List<Product> getAllProductsByIsVotingActive(Boolean isVotingActive) {
        return productRepository.findAllByIsVotingActive(isVotingActive);
    }

    @Override
    public List<Product> getAllProductsByIsCommentsAndVotesPublic(Boolean isCommentsAndVotesPublic) {
        return productRepository.findAllByIsCommentsAndVotesPublic(isCommentsAndVotesPublic);
    }

    @Override
    public Boolean getIsShowPublicByProductId(Long id) {
        return productRepository.findIsShowPublicByProductId(id);
    }

    @Override
    public Boolean getIsCommentingActiveByProductId(Long id) {
        return productRepository.findIsCommentingActiveByProductId(id);
    }

    @Override
    public Boolean getIsVotingActiveByProductId(Long id) {
        return productRepository.findIsVotingActiveByProductId(id);
    }

    @Override
    public Boolean getIsCommentsAndVotesByProductId(Long id) {
        return productRepository.findIsCommentsAndVotesPublicByProductId(id);
    }

    @Override
    public Integer getCountOfComments() {
        return Math.toIntExact(commentRepository.countByStatus(CommentStatus.CONFIRMED));
    }

    @Override
    public Double getAverageOfScores() {
        return voteRepository.calculateAverageScores();
    }

    @Override
    public List<Comment> getLast3CommentsByProductIdAndStatus(Long id) {
        return commentRepository.findTop3ByProductIdAndStatusOrderByCreatedAtDesc(id, CommentStatus.CONFIRMED);
    }

    @Override
    public void confirmComment(Long commentId) {
        Optional<Comment> commentOptional = commentRepository.findById(commentId);
        commentOptional.ifPresent(comment -> {
            comment.setStatus(CommentStatus.CONFIRMED);
            commentRepository.save(comment);
        });
    }

    @Override
    public void rejectComment(Long commentId) {
        Optional<Comment> commentOptional = commentRepository.findById(commentId);
        commentOptional.ifPresent(comment -> {
            comment.setStatus(CommentStatus.REJECTED);
            commentRepository.save(comment);
        });
    }

    @Override
    public void confirmVote(Long voteId) {
        Optional<Vote> voteOptional = voteRepository.findById(voteId);
        voteOptional.ifPresent(vote -> {
            vote.setStatus(VoteStatus.CONFIRMED);
            voteRepository.save(vote);
        });
    }

    @Override
    public void rejectVote(Long voteId) {
        Optional<Vote> voteOptional = voteRepository.findById(voteId);
        voteOptional.ifPresent(vote -> {
            vote.setStatus(VoteStatus.REJECTED);
            voteRepository.save(vote);
        });
    }
}
