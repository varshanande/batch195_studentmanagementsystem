package edu.cjc.sms.app.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.sms.app.model.Student;
import edu.cjc.sms.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepository sr;

	@Override
	public void saveStudent(Student student) {
	sr.save(student);
		
	}
	

	
	
	
}
