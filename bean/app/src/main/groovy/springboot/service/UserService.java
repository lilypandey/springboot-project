package springboot.service;

import springboot.bean.UserConfig;

public class UserService {
    UserConfig userConfig;
    public UserService(UserConfig userConfig){
        this.userConfig = userConfig;
    }
}
