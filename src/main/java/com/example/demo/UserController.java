package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;





@Controller
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/add")
    public String getIndexPage() {
        return "index";
    }
    @PostMapping("/add")
    public ModelAndView addUser(@RequestParam String name, 
            @RequestParam String email, 
            @RequestParam int age, 
            @RequestParam String dateOfBirth) {

            LocalDate dob = null;
            dob = LocalDate.parse(dateOfBirth);

            User user = new User();
            user.setName(name);
            user.setEmail(email);
            user.setAge(age);
            user.setDob(dob); 
            userRepository.save(user);
        return new ModelAndView("success"); 
    }

    @GetMapping("/display")
    public String displayUsers(Model model) {
        List<User> usersList = userRepository.findAll();
         model.addAttribute("users", usersList);
        return "userList";
    }

}