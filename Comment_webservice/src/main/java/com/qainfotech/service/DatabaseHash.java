package com.qainfotech.service;
import java.util.HashMap;
import java.util.Map;

public class DatabaseHash {
	
	public static Map<Integer, ShowUser> users = new HashMap<>();
	public static Map<Integer, CommentAdd> users1 = new HashMap<>();
	public static Map<Integer, ShowUser> getUsers() {
		return users;
	}
	public static Map<Integer, CommentAdd> getUsers1() {
		return users1;
	}
}

