package com.app;

import java.io.File;
import java.io.IOException;

import com.app.jackson.Student;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.*;

public class App {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();

		Student theStudent = objectMapper.readValue(new File("data/sample.json"), Student.class);
		System.out.println(theStudent);
		Student editStudent= new Student(2, "Ashish", "Dubbewar", true);
		objectMapper.writeValue(new File("data/sample.json"), editStudent);

		System.out.println(edi);
		

	}
}
