package com.javainuse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/welcome.html")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	

		@RequestMapping("/contactus.html")
		public ModelAndView secondPage() {
			return new ModelAndView("contactus");
		}
		
		@RequestMapping("/jagan.html")
		public ModelAndView thirdPage() {
			return new ModelAndView("jagan");
		}

}
