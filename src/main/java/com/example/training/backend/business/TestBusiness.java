package com.example.training.backend.business;

import com.example.training.backend.exception.BaseException;
import com.example.training.backend.exception.UserException;
import com.example.training.backend.model.MRegisterRequest;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TestBusiness {

    public String register(MRegisterRequest request) throws BaseException {
        if (request == null) {
            throw UserException.requestNull();
        }
        if (Objects.isNull(request.getEmail())) {
            throw UserException.emailNull();
        }
        return "";
    }
}
