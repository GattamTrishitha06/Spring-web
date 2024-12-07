package com.klu.SpringWebMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public ModelAndView demo()
	{
	   ModelAndView mv= new ModelAndView();
	   mv.setViewName("index");
	   return mv;
	}
	 @GetMapping("/welcome")
	    public String welcome(Model model) {
	        model.addAttribute("message", "Welcome to Spring MVC!");
	        return "Welcome"; // Corresponds to welcome.jsp
	    }
	 @GetMapping("/test")
	    public String test() {
	        return "test"; // Corresponds to test.jsp
	    }

	    @GetMapping("/showInfo")
	    public String showInfo(@RequestParam("id") int id, @RequestParam("name") String name, Model model) {
	        model.addAttribute("id", id);
	        model.addAttribute("name", name);
	        return "showInfo"; // Corresponds to showInfo.jsp
	    }

	    @GetMapping("/calculateSum/{num1}/{num2}")
	    public String calculateSum(@PathVariable int num1, @PathVariable int num2, Model model) {
	        int sum = num1 + num2;
	        model.addAttribute("num1", num1);
	        model.addAttribute("num2", num2);
	        model.addAttribute("sum", sum);
	        return "calculateSum"; // Corresponds to calculateSum.jsp
	    }

	    @GetMapping("/employeeForm")
	    public String employeeForm() {
	        return "employeeForm"; // Corresponds to employeeForm.jsp
	    }
	    @GetMapping("/addNumbers")
	    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
	        int sum = num1 + num2;
	        model.addAttribute("num1", num1);
	        model.addAttribute("num2", num2);
	        model.addAttribute("sum", sum);
	        return "addNumbers"; // Corresponds to addNumbers.jsp
	    }

	    @GetMapping("/combine")
	    public String combine(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
	        String combined = str1 + " " + str2;
	        model.addAttribute("combined", combined);
	        return "combine"; // Corresponds to combine.jsp
	    }

	    @GetMapping("/calculate")
	    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
	        int sum = num1 + num2;
	        int product = num1 * num2;
	        model.addAttribute("num1", num1);
	        model.addAttribute("num2", num2);
	        model.addAttribute("sum", sum);
	        model.addAttribute("product", product);
	        return "calculate"; // Corresponds to calculate.jsp
	    }

}
