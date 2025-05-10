package com.example.thymeleaf.gtvg.controller;

import com.example.thymeleaf.gtvg.model.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/userprofile")
@Controller
public class UserProfileController {
  @GetMapping("")
  public String getUserProfile(HttpSession session) {
    User user = new User("John", "Doe", "Republic of Banana", 23);

    session.setAttribute("user", user);
    return "userprofile";
  }
}
