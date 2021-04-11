package com.accounts.accounts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accounts.accounts.entity.UserAccount;

public interface UserDao extends JpaRepository<UserAccount, Long>{

}
