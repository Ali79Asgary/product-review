package com.example.demo.service;

import com.example.demo.model.ProductAdmin;
import com.example.demo.repository.ProductAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductAdminServiceImpl implements ProductAdminService {

    private final ProductAdminRepository productAdminRepository;

    @Override
    public List<ProductAdmin> getAllProductAdmins() {
        return null;
    }

    @Override
    public ProductAdmin getProductAdminById(Long id) {
        return null;
    }

    @Override
    public ProductAdmin saveProductAdmin(ProductAdmin productAdmin) {
        return null;
    }

    @Override
    public ProductAdmin updateProductAdmin(Long id, ProductAdmin newProductAdmin) {
        return null;
    }

    @Override
    public void deleteProductAdminById(Long id) {

    }
}
