package com.kuang.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * user
 *
 * @author
 */
@Data
public class User implements Serializable, UserDetails {
    private Integer id;

    private String username;

    private String password;

    /**
     * 这里因为isEnabled和getEnabled冲突，所以将enabled的lombok生成的getEnabled去掉
     * 如何查看lombok生成的get和set，可以查看Structure
     */
    @Getter(AccessLevel.NONE)
    private Boolean enabled;

    private Boolean locked;

    private static final long serialVersionUID = 1L;

    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}