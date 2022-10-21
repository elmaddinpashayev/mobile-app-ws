package com.forbrightfuture.app.ws.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "MBUser")
@Data
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 4454684507970474673L;
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable=false)
    private String userId;

    @Column(nullable=false, length=50)
    private String firstName;

    @Column(nullable=false, length=50)
    private String lastName;

    @Column(nullable=false, length=120, unique = true)
    private String email;

    @Column(nullable=false)
    private String encryptedPassword;

    private String emailVerificationToken;

    @Column(nullable=false )
    private Boolean emailVerificationStatus = false;

}
