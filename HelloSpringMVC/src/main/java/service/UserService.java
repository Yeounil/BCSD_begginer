package service;

import domain.User;

public interface UserService {
    User createUser(User user);
    User getUserInfo();
    User updateUserById(Long id);
    User deleteUserById(Long id);
}