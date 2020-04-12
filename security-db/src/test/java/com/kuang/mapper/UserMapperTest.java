package com.kuang.mapper;

import com.kuang.entity.Role;
import com.kuang.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void loadUserByUsername() {
        User user = userMapper.loadUserByUsername("admin");
        assertEquals(2, user.getId());
    }

    @Test
    public void getUserRolesByUid() {
        List<Role> roles = userMapper.getUserRolesByUid(1);
        assertEquals(2, roles.size());
    }
}