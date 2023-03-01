package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.QuizRepository;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication  {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public QuizRepository quizRepository;

    public static void main(String[] args) {


        SpringApplication.run(ExamserverApplication.class, args);


    }

    @PostConstruct
    public void entryPoint() throws Exception {

        System.out.println("starting code");

        User user = new User();

        user.setFirstName("admin");
        user.setLastName("admin");
        user.setUsername("admin123");
        user.setPassword(this.bCryptPasswordEncoder.encode("admin@123"));
        user.setEmail("admin@gmail.com");
        user.setProfile("default.png");

        Role role1 = new Role();
        role1.setRoleId(44L);
        role1.setRoleName("ADMIN");

        Set<UserRole> userRoleSet = new HashSet<>();
        UserRole userRole = new UserRole();

        userRole.setRole(role1);

        userRole.setUser(user);

        userRoleSet.add(userRole);

        User user1 = this.userService.createUser(user, userRoleSet);
        System.out.println(user1.getUsername());


    }



}
