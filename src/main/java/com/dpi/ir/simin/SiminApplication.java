package com.dpi.ir.simin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SiminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiminApplication.class, args);
	}

}






//public class UserDTO {
//	@NotBlank(message = "Username is required")
//	private String username;
//
//	// getters and setters
//}
//
//@PostMapping("/create-user")
//public ResponseEntity<User> createUser(@Valid @RequestBody UserDTO userDTO) {
//	User user = new User();
//	user.setUsername(userDTO.getUsername());
//	return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
//}

//
//@Query(value = "SELECT * FROM users WHERE username = ?1", nativeQuery = true)
//User findByUsername(String username);

