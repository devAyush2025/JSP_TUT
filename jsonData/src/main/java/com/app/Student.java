package com.app;

import lombok.*;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private boolean active; 
}
