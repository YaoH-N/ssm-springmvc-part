package com.atguigu.pojo;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * Author: 牛耀辉
 * Date: 2024/11/17 15:44
 * Description:
 * 1. name 不为null和控字符串  字符串不为空 @NotBlank  集合不为空：@NotEmpty  包装类不为空：@NotNull
 * 2. password 长度大于6
 * 3. age 必须 >= 1
 * 4. email 邮箱格式的字符串
 * 5. birthday 过去的时间
 * <p>
 */
@Data
public class User {

    @NotBlank
    private String name;

    @Length(min = 6)
    private String password;

    @Min(1)
    private int age;

    @Email
    private String email;

    @Past
    private Date birthday;
}
