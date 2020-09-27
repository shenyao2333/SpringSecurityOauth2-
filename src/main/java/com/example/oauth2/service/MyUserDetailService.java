package com.example.oauth2.service;

import com.example.oauth2.domain.SeUser;
import com.example.oauth2.domain.TbUser;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sy
 * @date Created in 2020.9.27 16:11
 * @description
 */
@Configuration
@AllArgsConstructor
@Slf4j
public class MyUserDetailService implements UserDetailsService {

    private final TbUserService tbUserService;



    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

        TbUser tbUser = tbUserService.selectAllByUsername(name);
        log.info("查询出用户---》"+tbUser);
        if (tbUser==null){
            throw new UsernameNotFoundException("账号或密码错误！");
        }
        Set<String> permissions = new HashSet<>();
        permissions.add("ADMIN");

        SeUser authUser = new SeUser(tbUser.getId(), tbUser.getUsername(), tbUser.getPassword(), true, true, true, true,
                AuthorityUtils.createAuthorityList(permissions.toArray(new String[0])));
        return authUser;
    }


}
