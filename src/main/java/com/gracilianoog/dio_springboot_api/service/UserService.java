package com.gracilianoog.dio_springboot_api.service;

import com.gracilianoog.dio_springboot_api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
