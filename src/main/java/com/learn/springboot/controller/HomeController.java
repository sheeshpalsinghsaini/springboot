package com.learn.springboot.controller;

import com.learn.springboot.service.LoginService;
import org.springframework.stereotype.Component;

@Component
public class HomeController {

   final private LoginService loginService;

    public HomeController(LoginService loginService) {
        this.loginService = loginService;
    }


    public void loginUser(){
        loginService.login();;
        System.out.println("loggedIn Success");
    }



}
