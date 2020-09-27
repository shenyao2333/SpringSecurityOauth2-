package com.example.oauth2.domain;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author sy
 * @date Created in 2020.9.27 17:45
 * @description
 */
public class Twts {

    public static void main(String[] args) {

        System.out.println(new BCryptPasswordEncoder().encode("123456"));


    }


}
