package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class Hello {
    @RequestMapping("")
    public String getIndex(){
        return "index";
    }
}
