package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class i18nController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}