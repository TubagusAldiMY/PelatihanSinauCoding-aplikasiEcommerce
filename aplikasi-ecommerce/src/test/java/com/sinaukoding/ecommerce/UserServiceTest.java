package com.sinaukoding.ecommerce;

import com.sinaukoding.ecommerce.model.enums.Role;
import com.sinaukoding.ecommerce.model.enums.Status;
import com.sinaukoding.ecommerce.model.request.UserRequestRecord;
import com.sinaukoding.ecommerce.service.managementuser.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void addUserTest() {
        UserRequestRecord request = new UserRequestRecord(null,
                "Fariz",
                "fariz",
                "fariz@yopmail.com",
                "fariz123",
                Status.AKTIF,
                Role.PEMBELI
        );
        userService.add(request);
    }

}
