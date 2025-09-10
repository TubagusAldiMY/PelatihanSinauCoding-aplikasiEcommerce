package com.sinaukoding.ecommerce.service.app;

import com.sinaukoding.ecommerce.entity.managementuser.User;
import com.sinaukoding.ecommerce.model.app.SimpleMap;
import com.sinaukoding.ecommerce.model.request.LoginRequestRecord;

public interface AuthService {

    SimpleMap login(LoginRequestRecord request);

    void logout(User userLoggedIn);

}
