package com.commons.userservice.service;

import org.springframework.stereotype.Service;
import com.commons.userservice.entity.Country;
import com.commons.userservice.repository.CountryRepository;
import com.commons.userservice.util.BasicService;

@Service
public class CountryServiceImpl extends BasicService<Country, CountryRepository> implements CountryService {
}
