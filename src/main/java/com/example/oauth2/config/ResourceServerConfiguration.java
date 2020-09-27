package com.example.oauth2.config;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author sy
 * @date Created in 2020.9.27 0:06
 * @description 资源服务器配置
 */
@Configuration
@EnableResourceServer
@AllArgsConstructor
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter  {


    @Override
    @SneakyThrows
    public void configure(HttpSecurity http) {
        http
                // CRSF禁用，因为不使用session
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/oauth/**","/oauth/authorize","/login/**").permitAll()//开放的资源不用授权
                .anyRequest().authenticated();
    }

}
