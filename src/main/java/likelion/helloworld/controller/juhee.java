package likelion.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
// test
@Controller
public class juhee {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello-data")
    public String helloData(Model model) {
        model.addAttribute("nameKey", "노주희");
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String helloPath(@PathVariable String name, Model model) {
        model.addAttribute("nameKey", name);
        return "hello";
    }

    @GetMapping("/hello-param")
    public String helloParam(@RequestParam("name2") String name,
                             @RequestParam("age2") int age,
                             @RequestParam("major") String major,
                             Model model) {
        model.addAttribute("nameKey", name);
        model.addAttribute("ageKey", age);
        model.addAttribute("majorKey", major);
        return "hello";
    }

    @GetMapping("/hello-juhee")
    public String helloJuhee(@RequestParam("name") String name,
                             @RequestParam("age") int age,
                             @RequestParam("major") String major,
                             @RequestParam("MBTI") String mbti,
                             @RequestParam("hobby") String hobby,
                             Model model) {
        model.addAttribute("nameKey", name);
        model.addAttribute("ageKey", age);
        model.addAttribute("majorKey", major);
        model.addAttribute("MBTIKey", mbti);
        model.addAttribute("hobbyKey", hobby);
        return "juhee";
    }

}
