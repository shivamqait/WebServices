package com.qainfotech.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Service {
	
	public Map<Integer, ShowUser> users = DatabaseHash.getUsers();
	public Map<Integer, CommentAdd> users1 = DatabaseHash.getUsers1();
	
	public Service() {
		users.put(1, new ShowUser("shivam.sk","shivam","123456",1));
		users1.put(1, new CommentAdd("Feynman","wonderful",1));
	}
	
	
  
	public ShowUser addUser(ShowUser user) {
		user.setUserid(users.size() + 1);
		users.put(user.getUserid(),user);
		return user;
	}
	
	public String login(String email, String password)
	{
		
		ArrayList<ShowUser> temp = new ArrayList<ShowUser>(users.values());
		for (ShowUser users : temp)
		{
			if(users.getEmail().contentEquals(email)) {
				if(users.getPassword().contentEquals(password)) {
				   return "Logged in";
				}
			}
		}
		return null;
	}
	public CommentAdd addComment(CommentAdd add) {
		add.setMsgid(users1.size() + 1);
		users1.put(add.getMsgid(),add);
		return add;
	}
	public List<ShowUser> getAllUsers() {
		return new ArrayList<ShowUser>(users.values());
	}
	public List<CommentAdd> getAllUsers1() {
		return new ArrayList<CommentAdd>(users1.values());
	}
}

