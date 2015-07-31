package com.idocv.demo.dao;

import java.util.List;

import com.idocv.demo.po.User;

public interface UserDao {

	public User create(User user);

	public boolean delete(long id);

	public User update(User user);

	public User get(long id);

	public List<User> list(String query);

}