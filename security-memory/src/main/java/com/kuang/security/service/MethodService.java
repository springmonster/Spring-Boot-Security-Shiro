package com.kuang.security.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * 添加了@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)之后
 * 这里可以使用@Secured，@PreAuthorize，@PostAuthorize，其中使用表达式的语法
 */
@Service
public class MethodService {
    @Secured("ROLE_ADMIN")
    public String admin() {
        return "hello admin";
    }

    @PreAuthorize("hasRole('ADMIN') and hasRole('DBA')")
    public String dba() {
        return "hello dba";
    }

    @PreAuthorize("hasAnyRole('ADMIN','DBA','USER')")
    public String user() {
        return "user";
    }
}
