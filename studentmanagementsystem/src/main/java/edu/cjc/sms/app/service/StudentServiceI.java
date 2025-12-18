package edu.cjc.sms.app.service;

import java.util.List;

import edu.cjc.sms.app.model.Student;

public interface StudentServiceI {

public	List<Student> getStudent();

public void saveStudent(Student s);

}
