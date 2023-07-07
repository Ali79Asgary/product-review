package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByIsCommentingActive(Boolean isCommentingActive);

    List<Product> findAllByIsVotingActive(Boolean isVotingActive);

    @Query("SELECT p FROM Product p WHERE p.isCommentsAndVotesPublic=?1")
    List<Product> findAllByIsCommentsAndVotesPublic(Boolean isCommentsAndVotesPublic);

    @Modifying
    @Query("UPDATE Product p SET p.isCommentingActive=?2 WHERE p.id=?1")
    Product updateProductCommentsStatus(Long productId, Boolean isCommentingActive);
}
