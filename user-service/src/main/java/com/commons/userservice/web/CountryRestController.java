package com.commons.userservice.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.commons.userservice.entity.Country;
import com.commons.userservice.service.CountryService;

@RestController
@RequestMapping("country")
public class CountryRestController {
	
	@Autowired
	CountryService countryService;
	
	@GetMapping()
	public List<Country> findAll() {
		return countryService.findAll();
	}
	
}
