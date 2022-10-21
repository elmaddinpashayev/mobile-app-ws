package com.forbrightfuture.app.ws.controller;


import com.forbrightfuture.app.ws.dto.UserDTO;
import com.forbrightfuture.app.ws.model.request.UserDetailsRequestModel;
import com.forbrightfuture.app.ws.model.response.UserRest;
import com.forbrightfuture.app.ws.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser() {
        return "get";
    }

    @PostMapping("/create")
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {


        UserRest returnValue = new UserRest();

        UserDTO userDto = new UserDTO();
        BeanUtils.copyProperties(userDetails, userDto);

        UserDTO createUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createUser, returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateUser() {
        return "update";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete";
    }

}
