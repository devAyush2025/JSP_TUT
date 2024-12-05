package com.app.model;

import jakarta.validation.constraints.NotNull;

public class UpdateUserDetailsRequest {
	@NotNull(message = "FirstName should not be null")
	private String firstName;
	@NotNull(message = "LastName should not be null")
	private String lastName;
}
