package com.example.oauth2.filter;

import org.springframework.stereotype.Component;

/**
 * @author sy
 * @date Created in 2020.9.29 22:11
 * @description 过滤器
 */
@Component
public class OncePerRequestFilter extends org.springframework.web.filter.OncePerRequestFilter {
}
