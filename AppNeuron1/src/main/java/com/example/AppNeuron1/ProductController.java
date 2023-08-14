package com.example.AppNeuron1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam String name) {
        // Implement fuzzy search logic using the name parameter
        List<Product> searchResults = productRepository.findByNameFuzzy(name);
        return searchResults;
    }
}
