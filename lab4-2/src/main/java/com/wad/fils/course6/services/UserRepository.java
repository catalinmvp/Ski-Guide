package com.wad.fils.course6.services;

import com.wad.fils.course6.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    /*
    @Query("SELECT u FROM User u")
    List<User> findAll();

    @Query("SELECT u FROM User u WHERE u.username = :username")
    List<User> findUserByUsername(String username);
*/


    User findUserByUsername(String username);
}
