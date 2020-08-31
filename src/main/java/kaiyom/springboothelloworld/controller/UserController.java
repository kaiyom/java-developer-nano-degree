package kaiyom.springboothelloworld.controller;

import kaiyom.springboothelloworld.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUser(Model model) {
        List<User> userList = new ArrayList<>();
        userList.add( new User(101, "Joe", 19 ) );
        userList.add( new User(101, "Tom", 18 ) );
        userList.add( new User(101, "Alex", 21 ) );

        model.addAttribute("userList", userList );
        return "studentPage";
    }

}
