package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ProductRepository productRepository;

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
}
