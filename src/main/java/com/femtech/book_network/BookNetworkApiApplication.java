package com.femtech.book_network;

import com.femtech.book_network.role.Role;
import com.femtech.book_network.role.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableAsync

public class BookNetworkApiApplication {@Bean
public CommandLineRunner runner(RoleRepository roleRepository) {
	return args -> {
		if (roleRepository.findByName("USER").isEmpty()) {
			roleRepository.save(Role.builder().name("USER").build());
		}
	};
}


	public static void main(String[] args) {
		SpringApplication.run(BookNetworkApiApplication.class, args);}



}
