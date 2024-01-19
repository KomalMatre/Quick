package com.learnspringboot;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				
				new Course(1,"Learn AWS", "IN 28 minutes"),
				new Course(1,"Learn DevOps", "IN 28 minutes")	
				
				);
	}
}
