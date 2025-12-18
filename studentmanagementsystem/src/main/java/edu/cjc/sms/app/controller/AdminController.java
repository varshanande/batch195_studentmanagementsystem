package edu.cjc.sms.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.cjc.sms.app.model.Student;
import edu.cjc.sms.app.service.StudentServiceI;

@Controller
@RequestMapping("/")
public class AdminController {
	
	@Autowired
	StudentServiceI ssi;
	
	@GetMapping("/Student")
	public List<Student> getStudent(){
		
	return	ssi.getStudent();
		
	}
	
	@PostMapping("/Student")
	public void saveStudent(@RequestBody Student s) {
		
		ssi.saveStudent(s);
	}

}
