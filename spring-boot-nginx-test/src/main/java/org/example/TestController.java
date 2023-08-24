package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@ResponseBody
@SpringBootApplication
public class TestController {
    @GetMapping("/test")
    public String testApi(){
        return "nginx test HELLO!!";
    }
}
