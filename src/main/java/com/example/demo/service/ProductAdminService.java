package com.example.demo.service;

import com.example.demo.model.ProductAdmin;

import java.util.List;

public interface ProductAdminService {

    List<ProductAdmin> getAllProductAdmins();

    ProductAdmin getProductAdminById(Long id);

    ProductAdmin saveProductAdmin(ProductAdmin productAdmin);

    ProductAdmin updateProductAdmin(Long id, ProductAdmin newProductAdmin);

    void deleteProductAdminById(Long id);
}
