package edu.cjc.sms.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.sms.app.model.Student;
import edu.cjc.sms.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	StudentRepository sr;
	
	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		
		sr.save(s);
		
	}

}
