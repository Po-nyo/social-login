package com.example.social.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AuthController {

    @PostMapping("/auth/sign-in")
    public String signIn(@RequestBody SignInForm form) {
        System.out.println("받음: " + form.getUsername() + ", " + form.getPassword());
        return "받음: " + form.getUsername() + ", " + form.getPassword();
    }

    @Data
    public static class SignInForm {
        private String username;
        private String password;
    }
}
