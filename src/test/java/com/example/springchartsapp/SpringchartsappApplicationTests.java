package com.example.springchartsapp;

import com.example.springchartsapp.dao.PersonRepository;
import com.example.springchartsapp.entitiy.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class SpringchartsappApplicationTests {

//    @Test
//    void contextLoads() {
//    }
    @Autowired
    PersonRepository personRepository;
    @Test
    public void testCreate(){
        Optional<Person> byId = personRepository.findById(1L);
        byId.orElse(null);
    }
}
