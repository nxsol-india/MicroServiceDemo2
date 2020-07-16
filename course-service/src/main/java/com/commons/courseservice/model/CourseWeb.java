package com.commons.courseservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseWeb {
	private Long id;
	private String name;
	private double price;
	private String instituteName;
	private Country country;
}
