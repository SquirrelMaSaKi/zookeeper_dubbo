package com.rj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
//必须序列化
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String salt;
}
