package com.qainfotech.service;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;

@Path("/users")
public class ServiceResource {
	Service userService = new Service();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ShowUser> gettUsers() {	
		return userService.getAllUsers();
	}
	
	@GET
	@Path("/commentsView")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CommentAdd> gettUsers1() {	
		return userService.getAllUsers1();
	}

	@POST
	@Path("/new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ShowUser newUser (ShowUser user) {
		return userService.addUser(user);
	}
	
	
	  @POST	  
	  @Path("/login")	  
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)  
	  @Produces(MediaType.TEXT_HTML) 
	  public String userLogin (@FormParam("email") String email,
              @FormParam("pwd") String password) { 
		  return userService.login(email,password); 
	  }
	  
	  
	    @POST
		@Path("/comments")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
	    public CommentAdd comment (CommentAdd add) {
			return userService.addComment(add);
		}
	
}

