package com.app.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Customer {
	
	@NotNull
	@Size(max=15, min = 3, message = "min 3 or maximum 15 character")
	private String firstName;
	
	@NotNull
	@Size(min=2 ,message="Atleast enter 2 character")
	private String lastName;
	
	
	
	
}
