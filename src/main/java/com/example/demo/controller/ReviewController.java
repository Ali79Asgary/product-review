package com.example.demo.controller;

import com.example.demo.exception.NotFoundException;
import com.example.demo.model.Product;
import com.example.demo.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/is_show_public")
    public ResponseEntity<List<Product>> getAllProductsByIsShowPublic(@RequestParam("isShowPublic") Boolean isShowPublic) {
        List<Product> products = reviewService.getAllProductsByIsShowPublic(isShowPublic);
        if (products == null || products.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(products);
        }
    }

    @GetMapping("/is_commenting_active")
    public ResponseEntity<List<Product>> getAllProductsByIsCommentingActive(@RequestParam("isCommentingActive") Boolean isCommentingActive) {
        List<Product> products = reviewService.getAllProductsByIsCommentingActive(isCommentingActive);
        if (products == null || products.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(products);
        }
    }

    @GetMapping("/is_voting_active")
    public ResponseEntity<List<Product>> getAllProductsByIsVotingActive(@RequestParam("isVotingActive") Boolean isVotingActive) {
        List<Product> products = reviewService.getAllProductsByIsVotingActive(isVotingActive);
        if (products == null || products.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(products);
        }
    }

    @GetMapping("/is_comments_and_votes_public")
    public ResponseEntity<List<Product>> getAllProductsByIsCommentsAndVotesPublic(@RequestParam("isCommentsAndVotesPublic") Boolean isCommentsAndVotesPublic) {
        List<Product> products = reviewService.getAllProductsByIsCommentsAndVotesPublic(isCommentsAndVotesPublic);
        if (products == null || products.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(products);
        }
    }

    @GetMapping("/is_show_public/{id}")
    public ResponseEntity<Boolean> getIsShowPublicByProductId(@PathVariable Long id) {
        Boolean isShowPublic = reviewService.getIsShowPublicByProductId(id);
        if (isShowPublic == null) {
            throw new NotFoundException("Product not found with ID: " + id);
        } else {
            return ResponseEntity.ok(isShowPublic);
        }
    }

    @GetMapping("/is_commenting_active/{id}")
    public ResponseEntity<Boolean> getIsCommentingActiveByProductId(@PathVariable Long id) {
        Boolean isCommentingActive = reviewService.getIsCommentingActiveByProductId(id);
        if (isCommentingActive == null) {
            throw new NotFoundException("Product not found with ID: " + id);
        } else {
            return ResponseEntity.ok(isCommentingActive);
        }
    }

    @GetMapping("/is_voting_active/{id}")
    public ResponseEntity<Boolean> getIsVotingActiveByProductId(@PathVariable Long id) {
        Boolean isVotingActive = reviewService.getIsVotingActiveByProductId(id);
        if (isVotingActive == null) {
            throw new NotFoundException("Product not found with ID: " + id);
        } else {
            return ResponseEntity.ok(isVotingActive);
        }
    }

    @GetMapping("/is_comments_and_votes_public/{id}")
    public ResponseEntity<Boolean> getIsCommentsAndVotesByProductId(@PathVariable Long id) {
        Boolean isCommentsAndVotesPublic = reviewService.getIsCommentsAndVotesByProductId(id);
        if (isCommentsAndVotesPublic == null) {
            throw new NotFoundException("Product not found with ID: " + id);
        } else {
            return ResponseEntity.ok(isCommentsAndVotesPublic);
        }
    }
}
