package com.commons.courseservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.commons.courseservice.entity.Course;
import com.commons.courseservice.model.CourseWeb;
import com.commons.courseservice.model.User;
import com.commons.courseservice.repository.CourseRepository;
import com.commons.courseservice.util.BasicService;

@Service
public class CourseServiceImpl extends BasicService<Course, CourseRepository> implements CourseService {

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public CourseWeb findByCourseIdAndUserId(Long courseid, Long userid) {
		final String uri = "http://USER-SERVICE/user/"+userid;
		User user = this.restTemplate.getForObject(uri, User.class);
		
		Course entity = repository.findByCourseId(courseid);
		return CourseWeb.builder()
				.id(entity.getId())
				.name(entity.getName())
				.instituteName(entity.getInstituteName())
				.price(entity.getCountryId() == user.getCountry().getId() ? entity.getDomesticPrice() : entity.getInternationalPrice())
				.country(user.getCountry())
				.build();
	}
}
