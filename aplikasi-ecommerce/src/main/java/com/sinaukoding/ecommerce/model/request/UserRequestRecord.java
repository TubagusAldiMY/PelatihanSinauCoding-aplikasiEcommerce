package com.sinaukoding.ecommerce.model.request;

import com.sinaukoding.ecommerce.model.enums.Role;
import com.sinaukoding.ecommerce.model.enums.Status;

public record UserRequestRecord(String id,
                                String nama,
                                String username,
                                String email,
                                String password,
                                Status status,
                                Role role) {
}