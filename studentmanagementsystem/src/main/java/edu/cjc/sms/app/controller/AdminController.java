package edu.cjc.sms.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.sms.app.model.Student;
import edu.cjc.sms.app.service.StudentServiceI;

 @Controller
public class AdminController {

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @PostMapping("login")
    public String onLogin(@RequestParam String username,
                          @RequestParam String password,
                          Model m) {

        if ("admin".equals(username) && "admin@123".equals(password)) {
            return "adminscreen";
        } else {
            m.addAttribute("login_fail", "Invalid username or password");
            return "login";
        }
    }

    @Autowired
    StudentServiceI ssi;

    @PostMapping("enroll_student")
    public String saveStudent(@ModelAttribute Student student) {
        ssi.saveStudent(student);
        return "adminscreen";
    }
}
