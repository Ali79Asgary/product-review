package com.example.demo.controller;

import com.example.demo.model.ProductAdmin;
import com.example.demo.service.ProductAdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product_admins")
@RequiredArgsConstructor
public class ProductAdminController {

    private final ProductAdminService productAdminService;

    @GetMapping
    public ResponseEntity<List<ProductAdmin>> getAllProductAdmins() {
        List<ProductAdmin> productAdmins = productAdminService.getAllProductAdmins();
        if (productAdmins == null || productAdmins.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(productAdmins);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductAdmin> getProductAdminById(@PathVariable Long id) {
        ProductAdmin productAdmin = productAdminService.getProductAdminById(id);
        if (productAdmin != null) {
            return ResponseEntity.ok(productAdmin);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<ProductAdmin> saveProductAdmin(@RequestBody ProductAdmin productAdmin) {
        ProductAdmin savedProductAdmin = productAdminService.saveProductAdmin(productAdmin);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProductAdmin);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductAdmin> updateProductAdmin(@PathVariable Long id, @RequestBody ProductAdmin newProductAdmin) {
        ProductAdmin updatedProductAdmin = productAdminService.updateProductAdmin(id, newProductAdmin);
        return ResponseEntity.ok(updatedProductAdmin);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductAdmin(@PathVariable Long id) {
        productAdminService.deleteProductAdminById(id);
        return ResponseEntity.noContent().build();
    }
}
