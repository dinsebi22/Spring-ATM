package com.example.demo;

import com.example.demo.Models.User;
import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;

@Component
public class CommandLineRunnerSetup implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String...args) throws Exception {

        // Upload Example Data

        User user1 = new User("John" , "Jones" , "jjones@yahoo.com" , "jjones", passwordEncoder.encode("password"));
        User user2 = new User("Mark" , "Smith" , "msmith@yahoo.com" , "msmith", passwordEncoder.encode("123456"));
        User user3 = new User("Ana" , "Joe" , "ajoe@yahoo.com" , "ajoe", passwordEncoder.encode("password"));
        User user4 = new User("Mike" , "Lones" , "mlones@yahoo.com" , "mlones", passwordEncoder.encode("password"));

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);

        System.out.println("Added 4 Users");

    }
}
