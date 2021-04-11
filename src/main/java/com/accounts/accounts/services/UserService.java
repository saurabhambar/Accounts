package com.accounts.accounts.services;

import java.util.List;

import com.accounts.accounts.entity.UserAccount;

public interface UserService {
	
	public List<UserAccount> getUsers();
	public UserAccount getUsers(long userId);
	public UserAccount addUser(UserAccount user);
	public void deleteUser(long userId);
	public UserAccount updateUser(UserAccount user);
}
