package kaiyom.springboothelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUser(Model model) {
        model.addAttribute("msg", "Hello, Student" );

        double grade = 90.5;
        model.addAttribute("grade", grade );
        model.addAttribute("GPA", convertGPA(grade) );

        return "studentPage";
    }

    public String convertGPA (double grade) {
        if (grade >= 90) {
            return "A";
        }
        else if (grade < 90 && grade >= 80) {
            return "B";
        }
        else if (grade < 80 && grade >= 70) {
            return "C";
        }
        else if (grade < 70 && grade >= 60) {
            return "D";
        }
        else {
            return "F";
        }
    }
}
