package com.learn.springboot.serviceImpl;

import com.learn.springboot.service.LoginService;
import org.springframework.stereotype.Component;

@Component
public class MySQLLoginService implements LoginService {
    @Override
    public void login() {
        System.out.println("LoggedIn user using MySQL Database!!!");
    }

    @Override
    public void logout() {
        System.out.println("Logged out user from MySQL Database!!!");
    }
}
