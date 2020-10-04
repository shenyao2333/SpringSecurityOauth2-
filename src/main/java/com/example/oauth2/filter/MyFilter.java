package com.example.oauth2.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sy
 * @date Created in 2020.9.29 22:11
 * @description 过滤器
 */
@Component
@Slf4j
public class MyFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

        log.info("请求路径{}",httpServletRequest.getRequestURI());
        doFilter(httpServletRequest,httpServletResponse,filterChain);

    }





}
