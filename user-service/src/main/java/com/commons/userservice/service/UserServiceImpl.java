package com.commons.userservice.service;

import org.springframework.stereotype.Service;
import com.commons.userservice.entity.User;
import com.commons.userservice.repository.UserRepository;
import com.commons.userservice.util.BasicService;

@Service
public class UserServiceImpl extends BasicService<User, UserRepository> implements UserService {
}