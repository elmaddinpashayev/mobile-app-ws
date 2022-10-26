package com.forbrightfuture.app.ws.service;

import com.forbrightfuture.app.ws.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
  UserDTO  createUser(UserDTO userDTO);
//  UserDTO getUser(String email);
}
