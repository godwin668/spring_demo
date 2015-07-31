package com.idocv.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idocv.demo.dao.UserDao;
import com.idocv.demo.po.User;
import com.idocv.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public User create(User user) {
		return userDao.create(user);
	}

	@Override
	public boolean delete(long id) {
		return userDao.delete(id);
	}

	@Override
	public User update(User user) {
		return userDao.update(user);
	}

	@Override
	public User get(long id) {
		return userDao.get(id);
	}

	@Override
	public List<User> list(String query) {
		return userDao.list(query);
	}

}