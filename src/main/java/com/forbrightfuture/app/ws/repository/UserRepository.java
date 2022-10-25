package com.forbrightfuture.app.ws.repository;


import com.forbrightfuture.app.ws.dto.UserDTO;
import com.forbrightfuture.app.ws.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByEmail(String email);
    UserDTO getUser(String email);
}
