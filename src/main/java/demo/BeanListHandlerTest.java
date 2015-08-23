package demo;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Test;

import bean.User;
import dao.UserDao;

public class BeanListHandlerTest {

	@Test
	public void rightTest() throws SQLException {
		UserDao userDao = new UserDao();
		List<User> users = userDao.getUsersByCourse("英语");
		System.out.println(ReflectionToStringBuilder.toString(users));
		for (User user : users) {
			System.out.println(ReflectionToStringBuilder.toString(user));
		}
	}
	
	@Test
	public void wrongTest() throws SQLException {
		UserDao userDao = new UserDao();
		List<User> users = userDao.getUsersByCourse("体育");
		System.out.println(ReflectionToStringBuilder.toString(users));
		for (User user : users) {
			System.out.println(ReflectionToStringBuilder.toString(user));
		}
	}
	
	@Test
	public void nullArgumentTest() throws SQLException {
		UserDao userDao = new UserDao();
		List<User> users = userDao.getUsersByCourse(null);
		System.out.println(ReflectionToStringBuilder.toString(users));
		for (User user : users) {
			System.out.println(ReflectionToStringBuilder.toString(user));
		}
	}
	
}
