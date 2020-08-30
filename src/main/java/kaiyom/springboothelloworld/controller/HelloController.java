package kaiyom.springboothelloworld.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    private final Map<String, Object> result = new HashMap<>();

    @RequestMapping(value = "/hello")
    public Map<String, Object> hello() {
        result.put("name", "Joe");
        result.put("city", "Dhaka");
        return result;
    }
}
