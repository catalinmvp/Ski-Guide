package com.wad.fils.course6.services;

import com.wad.fils.course6.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    @Override
    public User save(User user) {
        return userRepository.save(user);
    }



}
