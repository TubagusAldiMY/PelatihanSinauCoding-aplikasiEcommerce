package com.sinaukoding.ecommerce.service.managementuser;

import com.sinaukoding.ecommerce.model.app.SimpleMap;
import com.sinaukoding.ecommerce.model.filter.UserFilterRecord;
import com.sinaukoding.ecommerce.model.request.UserRequestRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    void add(UserRequestRecord request);

    void edit(UserRequestRecord request);

    Page<SimpleMap> findAll(UserFilterRecord filterRequest, Pageable pageable);

    SimpleMap findById(String id);

}