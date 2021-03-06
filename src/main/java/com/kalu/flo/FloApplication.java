package com.kalu.flo;

import com.kalu.flo.model.UserEntity;
import com.kalu.flo.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class FloApplication {

    @Autowired
    private UserEntityRepository userEntityRepository;

	public static void main(String[] args) {
		SpringApplication.run(FloApplication.class, args);

	}

//	@EventListener(ApplicationReadyEvent.class)
//    public void testRepository(){
//        UserEntity u = new UserEntity();
//        u.setAddress("address");
//        u.setPhone("phone");
//        u.setName("name");
//        u.setEmail("email");
//        u.setEmail_activated(true);
//        u.setSurname("surname");
//        u.setRole("admin");
//        u.setPassword("password");
//
//
//        userEntityRepository.save(u);
//
//    }

}
