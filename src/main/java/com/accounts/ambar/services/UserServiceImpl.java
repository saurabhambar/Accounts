package com.accounts.ambar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.ambar.entity.UserAccount;
import com.accounts.ambar.repository.UserDao;

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
		
		return userDao.findById(userId).get();
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
