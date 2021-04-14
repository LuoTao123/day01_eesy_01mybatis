package com.itheima.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LuoTao
 * @version 1.0
 * @date 2021/4/14 9:45
 */

@Data
public class User implements Serializable {

    private Integer id;
    private String username;
    private Date birthday;
    private String sex;

}
