package com.springbootopenapi.springbootopenapi.resource;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/demo")
@Tag(name = "Demo Resource API")
public class DemoController {

    @GetMapping("")
    @Operation(description = "Api to fetch the all the demo message which are available available",
            responses = {@ApiResponse(responseCode = "200", description = "Success"),
                    @ApiResponse(responseCode = "400", description = "Bad Request")},
            tags = "getMessage",
            summary = "Api to fetch the all the messages available",
            security = {@SecurityRequirement(name = "X-CLIENT-ID"),
            @SecurityRequirement(name = "X-CLIENT"),
            @SecurityRequirement(name = "X-CLIENT-SECRET")}
    )
    ResponseEntity<List<String>> getMessage() {
        List<String> messages = new ArrayList<>();
        messages.add("Hello......");
        messages.add("This is Demo Message......");
        return ResponseEntity.ok().body(messages);
    }
}
