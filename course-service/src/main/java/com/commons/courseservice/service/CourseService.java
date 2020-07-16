package com.commons.courseservice.service;

import com.commons.courseservice.entity.Course;
import com.commons.courseservice.model.CourseWeb;
import com.commons.courseservice.util.IFinder;
import com.commons.courseservice.util.IService;

public interface CourseService extends IService<Course>,IFinder<Course>{
	CourseWeb findByCourseIdAndUserId(Long courseid, Long userid);
}
