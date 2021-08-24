package com.example.training.backend.api;

import com.example.training.backend.business.TestBusiness;
import com.example.training.backend.model.MRegisterRequest;
import com.example.training.backend.model.TestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/test")
public class TestApi {


//    Method: 1
//    @Autowired
//    private TestBusiness business;

//    Method:2
       private final TestBusiness business;

    public TestApi(TestBusiness business) {
        this.business = business;
    }


    @GetMapping
    public TestResponse test(){
        TestResponse response = new TestResponse();
        response.setName("MyName");
        response.setFood("MyFood");
        return response;
    }

    @PostMapping
    @RequestMapping("/request")
    public ResponseEntity<String> register(@RequestBody MRegisterRequest request){
        String response = null;
        try {
            response = business.register(request);
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).build();

        }
    }
}
