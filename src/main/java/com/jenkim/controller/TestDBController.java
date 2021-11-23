package com.jenkim.controller;

import com.jenkim.dao.TestDAO;
import com.jenkim.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestDBController {

    @Autowired
    private TestDAO testDAO;

    @GetMapping("/hi")
    public List<TestDTO> HelloWorld() {
        return testDAO.getTestData();
    }
}
