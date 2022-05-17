package service;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserMapper;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper UserMapper;

    @Override
    public User createUser(User user){
        UserMapper.createUser(user);
    }

    @Override
    public User getUserInfo(){
        return UserMapper.getUserById(id);
    }

    @Override
    public User updateUser(long id){
        UserMapper.updateUserById(id);
    }

    @Override
    public User deleteUser(long id){
        UserMapper.deleteUserById(id);
    }
}