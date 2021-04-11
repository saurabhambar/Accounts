package com.accounts.ambar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accounts.ambar.entity.UserAccount;

public interface UserDao extends JpaRepository<UserAccount, Long>{

}
