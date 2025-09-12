package com.codedecode.userInfo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private int userId;
    private String userName;
    private String userPassword;
    private String email;
    private String address;
    private String city;
    private int role;
    private String preferred_language;

}
