package com.nushops.controller;

import com.nushops.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public ApiResponse homeControllerHandler() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("welcome");
        return apiResponse;
    }
}
