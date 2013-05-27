package com.anonchat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnonchatController {

	@ResponseBody
	@RequestMapping(value="/hello")
	public String hello(){
		return "Hello, world!\n";
	}
	
/*	@RequestMapping(value="/hello")
	public ModelAndView helloPage(){
		Map<String,String> model = new HashMap<String,String>();
		model.put("foo", "bar");
		return new ModelAndView("hello",model);
	}

	@RequestMapping(value="/")
	public ModelAndView mainPage(){
		return new ModelAndView("main");
	} */
}
