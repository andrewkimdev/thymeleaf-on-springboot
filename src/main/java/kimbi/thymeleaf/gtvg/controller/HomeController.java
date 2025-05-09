package kimbi.thymeleaf.gtvg.controller;

import java.util.Calendar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller()
public class HomeController {

  @ModelAttribute("today")
  private Calendar getToday() {
    return Calendar.getInstance();
  }

  @GetMapping("")
  public String home() {
    return "/home";
  }
}
