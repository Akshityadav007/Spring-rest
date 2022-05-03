package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController												// add this annotation to tell spring that this is being used as spring rest
public class StudentResource {
	
	@RequestMapping("students")									// whenever there will be a call for localhost:8080/students this method will fetch the results or say map the results
	public List<Student> getStudent(){
		List<Student> students = new ArrayList<>();
		
		Random r = new Random();
		
		for(int i = 1;i <= 5;i++) {
		
		Student s = new Student();
		s.setRollNo(i);
		s.setName("Student " + i);
		s.setMarks(r.nextInt(100));
		
		students.add(s);
		}
		
		return students;
	}
}
