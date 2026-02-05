package com.codedecode.userInfo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name="userdb",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "firebase_uid"),
                @UniqueConstraint(columnNames = "email"),
                @UniqueConstraint(columnNames = "user_name")
        }
)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private int id;

    // Firebase Auth UID (source of truth for identity)
    @Column(name = "firebase_uid", nullable = false, updatable = false)
    private String firebaseUid;

    @Column(name = "user_name", nullable = false)
    private String userName;
//    private String userPassword;

    @Column(nullable = false)
    private String email;

    @Column(name = "full_name")
    private String fullName;

    @Column
    private String phone;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(length = 500)
    private String bio;

    // Delivery address
    @Column
    private String address;

    @Column
    private String city;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 1")
    // 1 = normal user, 2 = restaurant owner, 3 = admin
    private int role;

    @Column(name = "preferred_language", length = 10, nullable = false)
    private String preferred_language;

}
