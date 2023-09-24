package com.yarisingu.loginpage.helper;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarisingu.loginpage.dto.UserSignup;

public interface UserRepository extends JpaRepository<UserSignup, Integer>{
    
}
