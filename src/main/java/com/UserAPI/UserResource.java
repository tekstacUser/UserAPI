package com.UserAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserResource {
	
	public static List<User> userList = new ArrayList<>();
	
	public UserResource() {
		User u1 = new User(1, "John", "john@123");
		User u2 = new User(2, "Marry", "john89");
		User u3 = new User(3, "Kelly", "k@1234");
		userList.addAll(Arrays.asList(u1,u2,u3));
	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> get() {
		return userList;
	} 
	

}
