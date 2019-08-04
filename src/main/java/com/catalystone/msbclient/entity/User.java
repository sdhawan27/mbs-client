package com.catalystone.msbclient.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="user_info")
public class User {

    @Column(name="username")
    @Id
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="role")
    private String role;

}
