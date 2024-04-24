package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printHello(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}