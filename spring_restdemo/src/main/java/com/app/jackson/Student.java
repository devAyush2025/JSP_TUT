package com.app.jackson;

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
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private boolean active; 
}
