package rvt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Controller
public class DefaultController {
    
    @GetMapping(value = "/hello")
    String hello() {
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

    @GetMapping(value = "/money")
    ModelAndView money(){
        ModelAndView modelAndView = new ModelAndView("money");
        return modelAndView;
    }

    @GetMapping(value = "/registration")
    public String register(HttpServletRequest request, Model model){
        model.addAttribute("student", new Student());
        if (request.getParameter("success") != null) {
            return "registration-success";
        }
        return "registration";
    }

    @PostMapping(value = "/registration")
    public String register(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
        
        if (bindingResult.hasErrors()) {
            return "registration";
        }

        System.out.println(student);

        return "redirect:/registration?success";
    }
}
