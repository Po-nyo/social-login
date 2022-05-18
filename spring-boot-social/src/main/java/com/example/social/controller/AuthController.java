package com.example.social.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @PostMapping("/api/auth/sign-in")
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
