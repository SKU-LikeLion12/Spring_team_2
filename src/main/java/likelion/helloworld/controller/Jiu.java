package likelion.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Jiu {

    @GetMapping("/jiu-param")
    public String helloParam(@RequestParam("name") String name,
                             @RequestParam("age") int age,
                             @RequestParam("hobby") String hobby,
                             @RequestParam("mbti") String mbti,
                             @RequestParam("major") String major, Model model){
        model.addAttribute("nameKey", name);
        model.addAttribute("ageKey", age);
        model.addAttribute("hobbyKey", hobby);
        model.addAttribute("mbtiKey", mbti);
        model.addAttribute("majorKey", major);
        return "jiu";
    }
}
