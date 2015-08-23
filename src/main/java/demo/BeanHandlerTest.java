package demo;

import java.sql.SQLException;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Test;

import bean.User;
import dao.UserDao;

public class BeanHandlerTest {

	@Test
	public void rightTest() throws SQLException {
		UserDao userDao = new UserDao();
		User user = userDao.getUserByLoginnameAndPassword("echo", "xu");
		System.out.println(ReflectionToStringBuilder.toString(user));
		if (user != null) {
			System.out.println(user.getId());
		}
	}
	
	@Test
	public void wrongTest() throws SQLException {
		UserDao userDao = new UserDao();
		User user = userDao.getUserByLoginnameAndPassword("kuang", "xu");
		System.out.println(ReflectionToStringBuilder.toString(user));
		if (user != null) {
			System.out.println(user.getId());
		}
	}
	
	@Test
	public void nullArgumentsTest() throws SQLException {
		UserDao userDao = new UserDao();
		User user = userDao.getUserByLoginnameAndPassword(null, null);
		System.out.println(ReflectionToStringBuilder.toString(user));
		if (user != null) {
			System.out.println(user.getId());
		}
	}
	
	
}
