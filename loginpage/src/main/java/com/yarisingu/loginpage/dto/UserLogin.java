package com.yarisingu.loginpage.dto;

import org.springframework.stereotype.Component;
// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
import lombok.Data;

@Data
// @Entity
@Component
public class UserLogin {
    
   // @Id
    private int id;
    private String email;
    private String passcode;
}
