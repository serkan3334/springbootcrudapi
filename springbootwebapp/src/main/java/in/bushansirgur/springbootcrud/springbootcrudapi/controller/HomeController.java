package in.bushansirgur.springbootcrud.springbootcrudapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
		
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

}
