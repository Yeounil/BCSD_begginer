package service;

import domain.User;

public interface UserService {
    User createUser(User user);
    User getUserInfo();
    User updateUserById(long id);
    User deleteUserById(long id);
}
