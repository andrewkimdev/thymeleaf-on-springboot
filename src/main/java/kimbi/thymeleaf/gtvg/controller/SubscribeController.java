package kimbi.thymeleaf.gtvg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/subscribe")
@Controller
public class SubscribeController {

    @GetMapping("")
    public String getSubscribeHome() {
        return "subscribe";
    }

    @PostMapping("")
    public String saveSubscriber(@RequestParam("email") String email) {
        System.out.println(email);
        return "redirect:/";
    }
}
