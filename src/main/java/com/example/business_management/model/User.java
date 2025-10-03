package com.example.business_management.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="first_name", nullable = false)
    private String first_name;

    @Column(name="last_name", nullable = false)
    private String last_name;

    @Column(name="user_email", nullable = false)
    private String email;

    @Column(name="user_password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name="user_role", nullable = false)
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Product> products;
}
