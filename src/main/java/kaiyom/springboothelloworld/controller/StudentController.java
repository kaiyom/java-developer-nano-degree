package kaiyom.springboothelloworld.controller;

import kaiyom.springboothelloworld.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class StudentController {

    @RequestMapping("/studentList")
    public String studentList(Model model) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(1, "Tom", 80.5));
        list.add(new Student(2, "Jerry", 90.4));
        list.add(new Student(3, "Joe", 77.5));

        model.addAttribute("listOfStudent", list);

        return "studentListPage";
    }
}
