package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/h2")
	public String h2() {
		return "h2";
	}

}
