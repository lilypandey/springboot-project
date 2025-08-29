package aop.logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component //ioc container will manage my logging class, if any other class wants to use this it can via autowire
public class Logging {
    @Before("execution(public void aop.service.UserService.logIn())")
    public void loggingAdvice1() {
         System.out.println("Before advice for login is executed");
    }

    @After("execution(public void aop.service.UserService.logIn())")
    public void loggingAdvice2(){
        System.out.println("After advice for login is executed");
    }

    @Around("execution(public void aop.service.UserService.logIn())")
    public void loggingAdvice3(){
        System.out.println("Before and After invoking method login");
    }
}
