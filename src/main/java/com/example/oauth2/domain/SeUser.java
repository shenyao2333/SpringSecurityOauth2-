package com.example.oauth2.domain;

import lombok.Data;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @author sy
 * @date Created in 2020.9.27 16:25
 * @description
 */
@Data
public class SeUser extends User {



    private Integer id;



    public SeUser(Integer id, String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.id = id;
    }

    public boolean isAdmin() {
        return isAdmin(this.id);
    }

    public static boolean isAdmin(Integer id) {
        return id != null && 1 == id;
    }


}
