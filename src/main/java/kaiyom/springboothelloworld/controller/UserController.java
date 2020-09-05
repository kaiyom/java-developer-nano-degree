package kaiyom.springboothelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUser(HttpServletRequest request, Model model) {

        /* --- simple debug -- to know more about HttpServletRequest --- */
        // Enumeration is as same as Iterator
        // all the request header properties key
        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            String nextElement = headerNames.nextElement();
            // returns the header property based on key
            String header = request.getHeader(nextElement);

            System.out.printf("%s : %s\n", nextElement, header );
        }

        // sometime one header key has multiple value (like: accept-language)
        Enumeration<String> headers = request.getHeaders("accept-language");
        while (headers.hasMoreElements())
            System.out.println(headers.nextElement());

        System.out.println(request.getHttpServletMapping().getPattern());
        System.out.println(request.getHttpServletMapping().getMatchValue());

        /* --- END: simple debug --- */

        // Request
        request.setAttribute("request", "request data");
        // Session
        request.getSession().setAttribute("session", "session data");
        // Application
        request.getSession().getServletContext().setAttribute("application", "application data");


        return "studentPage";
    }

}
