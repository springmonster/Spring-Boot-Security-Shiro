package com.kuang.mapper;

import com.kuang.entity.Role;
import com.kuang.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User loadUserByUsername(@Param("username") String username);

    List<Role> getUserRolesByUid(@Param("id") Integer id);
}