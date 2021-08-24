package com.microservice.service;

import com.microservice.entity.User;
import com.microservice.repository.UserRepository;
import com.microservice.vo.Department;
import com.microservice.vo.ResponseTemplateVo;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Inject
    private UserRepository userRepository;

    @Inject
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVo getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        ResponseTemplateVo vo = new ResponseTemplateVo();
        User user = userRepository.findByUserId(userId);

        Department department =
                restTemplate.getForObject("http://localhost:9001/departments/" + user.getDepartmentId()
                ,Department.class);
        vo.setUser(user);
        vo.setDepartment(department);

        return vo;



    }
}
