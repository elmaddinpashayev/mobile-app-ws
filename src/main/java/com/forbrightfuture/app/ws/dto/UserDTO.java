package com.forbrightfuture.app.ws.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {


    private static final long serialVersionUID = 3510012402779255526L;
    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private String emailVerificationStatus;
}
