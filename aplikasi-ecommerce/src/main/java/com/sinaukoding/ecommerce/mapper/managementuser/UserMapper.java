package com.sinaukoding.ecommerce.mapper.managementuser;

import com.sinaukoding.ecommerce.entity.managementuser.User;
import com.sinaukoding.ecommerce.model.request.UserRequestRecord;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User requestToEntity(UserRequestRecord request) {
        return User.builder()
                .nama(request.nama().toUpperCase())
                .username(request.username().toLowerCase())
                .email(request.email().toLowerCase())
                .status(request.status())
                .role(request.role())
                .build();
    }

}
