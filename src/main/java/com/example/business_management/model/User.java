package com.example.business_management.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="users")
@RequiredArgsConstructor
public class User {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="user_email")
    private String email;

    @Column(name="user_password")
    private String password;

    @ManyToOne
    @Column(name="user_role")
    private Role role;
}
