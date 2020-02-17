package com.srisai.srisaispringsecuritybasicauth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestSecurityController {


    @GetMapping("hello")
    @ResponseBody
    public ResponseEntity<String> getResult() {
        return new ResponseEntity<>("Hello Srisai", HttpStatus.OK);
    }


    @RequestMapping(value = "/error")
    public String myerror() {
        return "<center><h1>Something went wrong</h1></center>";
    }

}
