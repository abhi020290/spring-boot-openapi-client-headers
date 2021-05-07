package com.springbootopenapi.springbootopenapi.resource;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/welcome")
@Tag(name = "Welcome Resource API")
public class WelcomeController {

    @GetMapping("")
    @Operation(description = "Api to fetch the all the welcome message which are available available",
            responses = {@ApiResponse(responseCode = "200", description = "Success"),
                    @ApiResponse(responseCode = "400", description = "Bad Request")},
            tags = "getMessage",
            summary = "Api to fetch the all the welcome messages available"
    )
    ResponseEntity<List<String>> getMessage() {
        List<String> messages = new ArrayList<>();
        messages.add("Hello you most Welcome!......");
        messages.add("This is Welcome Message......");
        return ResponseEntity.ok().body(messages);
    }
}
