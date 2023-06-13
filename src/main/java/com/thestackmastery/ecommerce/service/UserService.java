package com.thestackmastery.ecommerce.service;

import com.thestackmastery.ecommerce.exceptions.UserNotFound;
import com.thestackmastery.ecommerce.models.User;
import com.thestackmastery.ecommerce.repositry.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepositry repo;

    public User updateUserDetails(Long userId, User user) throws UserNotFound {
        Optional<User> currentUser = repo.findById(userId);
        if (currentUser.isEmpty()) {
            throw new UserNotFound("User is not exists!");
        }

        User oldUserDetail = currentUser.get();
        if (Objects.nonNull(user.getGender())) {
            oldUserDetail.setGender(user.getGender());
        }

        if (Objects.nonNull(user.getFullName()) && !"".equals(user.getFullName())) {
            oldUserDetail.setFullName(user.getFullName().trim());
        }

        if (Objects.nonNull(user.getEmailAddress()) && !"".equals(user.getEmailAddress())) {
            oldUserDetail.setEmailAddress(user.getEmailAddress().trim());
        }

        if (Objects.nonNull(user.getPhoneNumber()) && !"".equals(user.getPhoneNumber())) {
            oldUserDetail.setPhoneNumber(user.getPhoneNumber().trim());
        }

        if (Objects.nonNull(user.getPassword()) && !"".equals(user.getPassword())) {
            oldUserDetail.setPassword(user.getPassword().trim());
        }

        return repo.save(oldUserDetail);
    }

    public boolean removeUserDetails(Long userId) {
        repo.deleteById(userId);
        return true;
    }

    public User createNewUserAccount(User user) throws UserNotFound {
        if (repo.existsByEmailAddress(user.getEmailAddress()) != null) {
            throw new UserNotFound("Email address is already taken.");
        }

        repo.save(user);
        return repo.save(user);
    }

    public User getUserById(Long userId) throws UserNotFound {
        Optional<User> user = repo.findById(userId);

        if (user.isEmpty()) {
            throw new UserNotFound("User is not found.");
        } 

        return user.get();
    }
}
