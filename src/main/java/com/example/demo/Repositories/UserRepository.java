package com.example.demo.Repositories;

import com.example.demo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);

//    Not used but still there if functionality would be added in the future
    void delete(User user);

    List<User> findAll();

    Optional<User> findById(Long id);

//    Am definit Query-uri in baza de data pe baza numelui metodei
//    The ones bellow at least :D

    boolean existsByFirstNameAndLastName(String firstName ,String lastName);

    User findByUsernameAndPassword(String username , String password);

    Optional<User> findByUsername(String userName);

}


