package com.example.SpringBoo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClgController {
	
	@Autowired
	ClgService service;
	
	@RequestMapping("/show")
	public String show(Model model) {
		
		List<Test1> list=service.display();
		for(Test1 t:list) {
			System.out.println(t.getId()+" "+t.getName()+" "+t.getFees());
		}
		model.addAttribute("data", list);
		return "index";
	}
	@RequestMapping("/new")
	public String add(Model model) {
		
		Test1 test=new Test1();
		model.addAttribute("test", test);
		return "index2";
		
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addData(@ModelAttribute("test") Test1 test) {
		
		service.save(test);
		return "redirect:/show";
	}
	
	
	
}
