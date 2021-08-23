package com.example.training.backend.api;

import com.example.training.backend.business.TestBusiness;
import com.example.training.backend.model.MRegisterRequest;
import com.example.training.backend.model.TestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestApi {


//    Method: 1
    @Autowired
    private TestBusiness business;

//    Method:2
       


    @GetMapping
    public TestResponse test(){
        TestResponse response = new TestResponse();
        response.setName("MyName");
        response.setFood("MyFood");
        return response;
    }

    @PostMapping
    @RequestMapping("/request")
    public String register(@RequestBody MRegisterRequest request){

        return "Received " + request;
    }
}
