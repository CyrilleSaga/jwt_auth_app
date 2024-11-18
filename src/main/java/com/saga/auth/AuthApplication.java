package com.saga.auth;

import com.saga.auth.entity.Role;
import com.saga.auth.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(RoleRepository roleRepository) {
		return args -> {
			// Create roles
			roleRepository.save(Role.builder().name("ROLE_USER").build());
			roleRepository.save(Role.builder().name("ADMIN").build());
		};
	}

}
