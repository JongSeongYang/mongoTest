package com.example.mongoTest;

import com.example.mongoTest.domain.UserEntity;
import com.example.mongoTest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public void addUser(){
        UserEntity user = UserEntity.builder()
                .userName("ab")
                .email("cd")
                .build();
        userRepository.save(user);
    }

}
