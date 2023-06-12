package com.thestackmastery.ecommerce.controller;

import com.thestackmastery.ecommerce.exceptions.UserNotFound;
import com.thestackmastery.ecommerce.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.thestackmastery.ecommerce.service.UserService;

@RestController
@RequestMapping(path = "/user/")
public class UserController {

    @Autowired
    private UserService service;

    @PutMapping(path = "create-user")
    public ResponseEntity<?> createUserAccount(@RequestBody(required = true) User user) {
        service.createNewUserAccount(user);
        return ResponseEntity.ok("");
    }

    @PostMapping(path = "authenticate-user")
    public ResponseEntity<?> loginToUserAccount() {
        return ResponseEntity.ok("");
    }

    @GetMapping(path = "user-detail/{userId}")
    public ResponseEntity<?> getCurrentUserDetail(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok("");
    }

    @PostMapping(path = "update-user/{userId}")
    public ResponseEntity<?> updateUserDetails(@PathVariable("userId") Long userId, @RequestBody(required = true) User user) throws UserNotFound {
        User updatedUserDetails = service.updateUserDetails(userId, user);
        return ResponseEntity.ok(updatedUserDetails);
    }

    @DeleteMapping(path = "remove-user/{userId}")
    public ResponseEntity<?> removeUser(@PathVariable("userId") Long userId) {
        boolean isDeletedUser = service.removeUserDetails(userId);
        return ResponseEntity.ok(isDeletedUser);
    }
}
