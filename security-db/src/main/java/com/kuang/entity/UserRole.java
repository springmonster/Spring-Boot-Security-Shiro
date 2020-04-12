package com.kuang.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * user_role
 *
 * @author
 */
@Data
public class UserRole implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer rid;

    private static final long serialVersionUID = 1L;
}