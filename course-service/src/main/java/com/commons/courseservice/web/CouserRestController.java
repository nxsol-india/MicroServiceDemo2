package com.commons.courseservice.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commons.courseservice.entity.Course;
import com.commons.courseservice.model.CourseWeb;
import com.commons.courseservice.service.CourseService;

@RestController
@RequestMapping("course")
public class CouserRestController {

	@Autowired
	CourseService courseService;
	
	
	
	@GetMapping()
	public List<Course> findAll() {
		return courseService.findAll();
	}
	
	@PostMapping()
	public ResponseEntity<?> create(@RequestBody Course course) {
		if(null != course.getCountryId()) {
			return new ResponseEntity<>("Country not found", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(courseService.save(course), HttpStatus.OK);
	}

	@GetMapping("/{courseid}/{userid}")
	public CourseWeb findByCourseIdAndUserId(@PathVariable Long courseid, @PathVariable Long userid) {
		
		return courseService.findByCourseIdAndUserId(courseid, userid);
	}
}
