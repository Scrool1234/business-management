package com.example.business_management.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="roles")
@RequiredArgsConstructor
public class Role {
    @Id
    @Column(name="id")
    private Long id;

    @OneToMany(mappedBy = "user")
    @Column(name="user_role")
    private String role;
}
