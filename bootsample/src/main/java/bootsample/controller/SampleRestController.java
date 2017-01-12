package bootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bootsample.service.TaskService;

@RestController
public class SampleRestController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World Sample rest controller";
	}
	
	@GetMapping("/all-tasks")
	private String allTasks() {
		return taskService.findAll().toString();
	}
}
