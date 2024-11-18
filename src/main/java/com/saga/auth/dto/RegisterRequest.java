package com.saga.auth.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class RegisterRequest {
    private String name;
    private String username;
    private String password;
    private List<String> roles;
}
