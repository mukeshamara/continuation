package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;

import java.util.*;
@Controller
@RequestMapping(value = "/register")
public class RegisterController{
@RequestMapping(method = RequestMethod.GET)
public String viewRegistration(Map<String, Object> model) {
User userForm= new User();
model.put("userForm", userForm);
return "index";
}
@RequestMapping(method = RequestMethod.POST)
public String processRegistration(@ModelAttribute("userForm") User user,
Map<String, Object> model) {
System.out.println("username: " + user.getUsername());
System.out.println("password: " + user.getPassword());
return "RegistrationSuccess";
}
}

