package fi.haagahelia.course.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ProductController {
	
	
@RequestMapping(value="/index", method=RequestMethod.GET)
	
	public String greeting(Model model)
	{
		return "hello";
	}

}
