package com.learn.springboot.serviceImpl;

import com.learn.springboot.service.LoginService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgresqlLoginService implements LoginService {
    @Override
    public void login() {
        System.out.println("User loggedIn using Postgresql Database!!!");
    }

    @Override
    public void logout() {
        System.out.println("User logged out from Postgresql Database!!!");
    }
}
