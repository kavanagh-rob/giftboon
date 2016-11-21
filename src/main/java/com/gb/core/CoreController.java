package com.gb.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

public class CoreController {
	

	@RestController
	public class GB_Controller {
		
		@RequestMapping("/user")
		public ModelAndView user() {
	 
			String message = "<br><div style='text-align:center;'>"
					+ "<h3>********** USER</h3> USER.java **********</div><br><br>";
			return new ModelAndView("welcome", "message", message);
		}

	}


}
