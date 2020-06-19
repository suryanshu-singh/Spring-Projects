package com.ibm.training;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	JdbcTemplate template;

	public List<User> getUsers() {
		
		return template.query("select * from userDetails", new UserMapper());
	}

	public User getUserById(int id) {
		return template.queryForObject("select * from userDetails where userID = ?",
				new Object[] {id},
				new UserMapper());
	}
	
	
	class UserMapper implements RowMapper<User>{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setUserID(rs.getInt("userID"));
			user.setUserName(rs.getString("userName"));
			user.setUserAddress(rs.getString("userAddress"));
			return user;
		}
		
	}


	public void updateByName(String name) {
		template.update("update user set password=? where userName=?",new Object[] {"abcd",name});
	}

	public void deleteByName(String name) {
		
		 template.update("delete from user where userName=? ",new Object[] {name});
		
	}

	public void addUser(String name, String password) {
		template.update("insert into user values(?,?)",new Object[] {name,password});
		
	}

}
