package com.app.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRequestDetailsModel {
	
	@NotNull(message = "FirstName should not be null")
	private String firstName;
	@NotNull(message = "LastName should not be null")
	private String lastName;
	@NotNull(message = "email should not be null")
	@Email
	private String email;
	
	@NotNull
	@Size(min = 8, max = 12,message = "password min 8 and max 12 characters")
	private String password;
	
	private String userId;
}
