package rvt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
    @GetMapping(value = "/")
    ModelAndView index() {
        Student student = new Student("John", "Smith", "a@a.lv", "DP2-4");
        List<Student> students = new ArrayList<>();
        students.add(student);

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("students", students);
        modelAndView.addObject("date", new Date().toString());
        return modelAndView;
    }

    @GetMapping(value = "/hello")
    String someTest() {
        return "hello";
    }

    @GetMapping(value = "/about")
    ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView("about");
        return modelAndView;
    }
    
    @GetMapping(value = "/input")
    ModelAndView input(){
        ModelAndView modelAndView = new ModelAndView("input");
        return modelAndView;
    }
    
}
