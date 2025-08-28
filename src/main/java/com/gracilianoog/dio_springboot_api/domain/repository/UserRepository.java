package com.gracilianoog.dio_springboot_api.domain.repository;

import com.gracilianoog.dio_springboot_api.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
