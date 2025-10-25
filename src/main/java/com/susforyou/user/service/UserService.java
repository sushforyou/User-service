package com.susforyou.user.service;

import com.susforyou.user.dto.UserDTO;
import com.susforyou.user.entity.User;
import com.susforyou.user.mapper.UserMapper;
import com.susforyou.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public UserDTO saveUser(UserDTO userDTO) {
        User savedUser = userRepo.save(UserMapper.INSTANCE.mapUserDTOToUser(userDTO));
        return UserMapper.INSTANCE.mapUserToUserDTO(savedUser);
    }

    public UserDTO getUserById(int id) {
        User user = userRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        return UserMapper.INSTANCE.mapUserToUserDTO(user);
    }
}
