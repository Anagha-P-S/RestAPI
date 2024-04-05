package com.ty.spring;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @PostMapping("/product")
    public String saveProduct(@RequestBody Product p) {
    	
    	//logic to save
        System.out.println(p);
        return "Product saved";
    }
    
    @GetMapping("/product/{pid}")
    public Product getProduct(@PathVariable Integer pid) {
        Product p = null;
        
        if(pid == 100) {
            p = new Product(100, "Book", 120.00);
        } else if(pid == 101) {
            p = new Product(101, "Bag", 700.00);
        }
        return p;
    }
    
    @GetMapping("/products")
    public List<Product> getProducts(){
        List<Product> products = new ArrayList<>();
        Product p1 = new Product(100, "Book", 120.00);
        Product p2 = new Product(101, "Bag", 700.00);
        products.add(p1);
        products.add(p2);
        return products;
    }
}
