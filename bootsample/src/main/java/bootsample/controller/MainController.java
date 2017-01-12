package bootsample.controller;

@Controller
public class MainController {
	
	@GetMapping("/hello")
	public String home() {
		return "index";
	}
}
