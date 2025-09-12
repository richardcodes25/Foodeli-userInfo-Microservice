package com.codedecode.userInfo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    private String userPassword;
    private String email;

    // user's Address to delivery food there
    private String address;
    private String city;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 1")
    // 1 = normal user, 2 = restaurant owner, 3 = admin
    private int role;

    @Column(nullable = false, columnDefinition = "CHAR(10) DEFAULT en")
    private String preferred_language;

}
