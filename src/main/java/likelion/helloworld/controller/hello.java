package likelion.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
// test
@Controller
public class hello {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/hello-data")
    public String helloData(Model model) {
        model.addAttribute("nameKey", "유민~");
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String helloPath(@PathVariable String name, Model model) {
        model.addAttribute("nameKey", name);
        return "hello";

    }
    @GetMapping("/yumin-param")
    public String yuminParam(@RequestParam("name") String name,
                             @RequestParam("age") int age,
                             @RequestParam("MBTI") String mbti,
                             @RequestParam("hobby") String game,
                             @RequestParam("major") String major, Model model) {
        model.addAttribute("nameKey", name);
        model.addAttribute("ageKey", age);
        model.addAttribute("MBTIKey", mbti);
        model.addAttribute("hobbyKey", game);
        model.addAttribute("majorKey", major);
        return "yumin";
    }
}
