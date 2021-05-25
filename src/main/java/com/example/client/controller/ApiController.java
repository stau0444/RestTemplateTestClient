package com.example.client.controller;

import com.example.client.dto.Product;
import com.example.client.dto.Req;
import com.example.client.dto.UserRequest;
import com.example.client.dto.UserResponse;
import com.example.client.service.RestTemplateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ApiController {

    private final RestTemplateService templateService;

    public ApiController(RestTemplateService templateService) {
        this.templateService = templateService;
    }


    @GetMapping("/hello")
    public UserResponse getHello(UserResponse userResponse){
        return templateService.hello(userResponse);
    }


    @GetMapping("/post")
    public UserResponse postHello(){
        return templateService.post();
    }


    @GetMapping("/exchange")
    public UserResponse exchangeHello(){
        return templateService.exchange();
    }


    @GetMapping("/generic-exchange")
    public Req<Product> genericExchangeHello(){
        return templateService.genericExchange();
    }
}
