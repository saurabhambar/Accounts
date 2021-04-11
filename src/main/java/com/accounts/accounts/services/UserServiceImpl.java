package com.accounts.accounts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.accounts.dao.UserDao;
import com.accounts.accounts.entity.UserAccount;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<UserAccount> getUsers() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public UserAccount getUsers(long userId) {
		// TODO Auto-generated method stub
		return userDao.getOne(userId);
	}

	@Override
	public UserAccount addUser(UserAccount user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		return user;
	}

	@Override
	public void deleteUser(long userId) {
		// TODO Auto-generated method stub
		UserAccount entity = userDao.getOne(userId);
		userDao.delete(entity);
	}

	@Override
	public UserAccount updateUser(UserAccount user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		return user;
	}

}
