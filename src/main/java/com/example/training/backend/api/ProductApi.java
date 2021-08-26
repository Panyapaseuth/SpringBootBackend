package com.example.training.backend.api;

import com.example.training.backend.business.ProductBussiness;
import com.example.training.backend.exception.BaseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductApi {

    public final ProductBussiness bussiness;


    public ProductApi(ProductBussiness bussiness) {
        this.bussiness = bussiness;
    }

    @GetMapping("{id}")
    public ResponseEntity<String> getId(@PathVariable("id") String id) throws BaseException {
        String response = bussiness.getProductById(id);
        return ResponseEntity.ok(response);
    }
}
