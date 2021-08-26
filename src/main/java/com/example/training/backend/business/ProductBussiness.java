package com.example.training.backend.business;

import com.example.training.backend.exception.BaseException;
import com.example.training.backend.exception.ProductException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ProductBussiness {

    public String getProductById(String id) throws BaseException {
        //TODO: Get data from database
        if (Objects.equals("1234", id)){
            throw ProductException.notFound();
        }
        return id;
    }
}
