package demo.demospringwar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String landing(Model model) {
		
		model.addAttribute("name","This is the message from ....");
		
		return "landing";
	}
}
