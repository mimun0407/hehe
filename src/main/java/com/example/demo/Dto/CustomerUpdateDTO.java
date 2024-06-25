package com.example.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerUpdateDTO {
    private String password;
    private String name;
    private String phoneNumber;
    private String email;
    private Set<String> roles;
}
