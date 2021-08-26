package com.example.training.backend.exception;

public class ProductException extends BaseException{
    public ProductException(String code){
        super("product." + code);
    }

    public static ProductException notFound(){
        return new ProductException("Not Found");
    }
}
