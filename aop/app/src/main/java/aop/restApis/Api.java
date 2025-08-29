package aop.restApis;

import aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @Autowired //userService instance will get initialized
    private UserService userService;

    @GetMapping("/")
    public String userLogin(){
        userService.logIn();
        return "User login endpoint called successfully!";
    }
}
