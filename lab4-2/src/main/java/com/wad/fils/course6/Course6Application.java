package com.wad.fils.course6;

import com.wad.fils.course6.domain.User;
import com.wad.fils.course6.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Course6Application {

  public static void main(String[] args) {
   ApplicationContext ctx = SpringApplication.run(Course6Application.class, args);
    UserService userService = ctx.getBean(UserService.class);
    User u1 = new User("doodoo","Doodoo","doodoo");
    System.out.println("from main" + u1);

    PasswordEncoder bcrypt = new BCryptPasswordEncoder();
    User user1 = new User("doodoo", bcrypt.encode("doodoo"));
    User user2 = new User("doodoo2", bcrypt.encode("doodoo2"));
    userService.save(user1);
    userService.save(user2);
  }

}
