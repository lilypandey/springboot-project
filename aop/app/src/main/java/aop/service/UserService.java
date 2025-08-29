package aop.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service //instance of class: singleton
public class UserService {
    @Getter
    @Setter
    @AllArgsConstructor //wil make public constrcutors for all fields
    public class User {
        private String name;
        private int age;
        private String address;
    }
    private User user;

    public UserService(){
        user = new User("Lily", 23, "India");
    }
    public void logIn(){
        System.out.println("Loggin user in");
    }

    public void logout() throws Exception{
        System.out.println("logging user out");
        throw new Exception("unable to logout the user");
    }
}
