package com.sinaukoding.ecommerce.model.filter;

import com.sinaukoding.ecommerce.model.enums.Role;
import com.sinaukoding.ecommerce.model.enums.Status;

public record UserFilterRecord(String nama,
                               String email,
                               String username,
                               Status status,
                               Role role) {
}