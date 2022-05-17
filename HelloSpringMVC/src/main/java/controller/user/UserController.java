package controller.user;

import controller.user.dto.LoginRequestDTO;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public User getUserInfo(Long id){
        return userService.getUserInfo(id);
    }

    @PostMapping(value="/login")
    public void userLogin(LoginRequestDTO loginRequest){

    }

}