package com.idocv.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.idocv.demo.dao.UserDao;
import com.idocv.demo.po.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User create(User user) {
		String name = user.getName();
		int age = user.getAge();
		int result = jdbcTemplate.update("insert into user(name, age) values(?, ?)", name, age);
		System.out.println("create user result: " + result);
		return user;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(long id) {
		User user = jdbcTemplate.queryForObject("select * from user where id = ?", new Object[]{id}, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
						user.setId(rs.getLong("id"));
						user.setName(rs.getString("name"));
						user.setAge(rs.getInt("age"));
						return user;
			}
		});
		return user;
	}

	@Override
	public List<User> list(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}