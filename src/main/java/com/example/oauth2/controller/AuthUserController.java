package com.example.oauth2.controller;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

/**
 * @author sy
 * @date Created in 2020.9.28 21:22
 * @description
 */
@RestController
@RequestMapping("/auth")
public class AuthUserController  {


    public static void main(String[] args) {
        String user_pass = "entfrm" + ":" + "entfrm";
        System.out.println(Base64.getEncoder().encodeToString("entfrm:entfrm".getBytes()));
        new BCryptPasswordEncoder().encode("123");

        byte[] bytes = user_pass.getBytes();
        String Basic = Base64.getEncoder().encodeToString(bytes);


    }



}
