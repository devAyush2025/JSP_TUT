package com.app.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.UserRequestDetailsModel;
import com.app.model.UserRest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class DemoRestController {

	Map<String, UserRest> users;

//	@GetMapping(path = "/users/{id}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
//	public UserRest getUserRest(@PathVariable String id) {
//		UserRest userRest = new UserRest();
//		userRest.setFirstName("Ashish");
//		userRest.setLastName("Dubbewar");
//		userRest.setEmail("ashish@gmail.com");
//		userRest.setUserId(id);
//		return userRest;
//	}

	@GetMapping(path = "/users/{id}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserRest> getUser(@PathVariable String id) {
		
	if(users.containsKey(id)) {
		return new ResponseEntity<UserRest>(users.get(id), HttpStatus.FOUND);
	}

		return new ResponseEntity<UserRest>(HttpStatus.NOT_FOUND);
	
		
		
	}
	
	@PostMapping(path = "/users", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserRest> getUserRest(@Valid @RequestBody UserRequestDetailsModel userRequestDetailsModel) {

		UserRest userRest = new UserRest();
		userRest.setFirstName(userRequestDetailsModel.getFirstName());
		userRest.setLastName(userRequestDetailsModel.getLastName());
		userRest.setEmail(userRequestDetailsModel.getEmail());
		String id = UUID.randomUUID().toString();
		userRest.setUserId(id);

		if (users == null) {
			users = new HashMap<String, UserRest>();
		}
		
		users.put(id, userRest);

		return new ResponseEntity<UserRest>(userRest, HttpStatus.CREATED);

	}
	
	@DeleteMapping(path = "/users/{id}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> deleteUser(@PathVariable String id) {
//		UserRest userRest;
		if(users.containsKey(id)) {
			users.remove(id);
			return new ResponseEntity<String>("User Successfully deleted with id "+id,HttpStatus.OK);
		}
	
			return new ResponseEntity<String>("User doesn't Exist",HttpStatus.NOT_FOUND);
			
	}
	
	@PutMapping(path = "/users/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<UserRest> updateUser(@PathVariable String id, @RequestBody UserRequestDetailsModel userRequestDetailsModel){
		UserRest userRest = users.get(id);
		System.out.println(userRest);
		userRest.setFirstName(userRequestDetailsModel.getFirstName());
		userRest.setLastName(userRequestDetailsModel.getLastName());
		userRest.setEmail(userRequestDetailsModel.getEmail());
		users.put(id, userRest);
		return  new ResponseEntity<UserRest>(userRest, HttpStatus.ACCEPTED);
	}

//	@PutMapping(path = "/users/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
//	public ResponseEntity<T>

}
