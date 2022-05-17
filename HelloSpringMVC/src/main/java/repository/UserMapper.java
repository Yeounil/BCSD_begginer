package repository;

import domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    void createUser(User user);
    User getUserById(Long id);
    void updateUserById(Long id);
    void deleteUserById(Long id);
}