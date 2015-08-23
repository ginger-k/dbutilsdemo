package demo;

import java.sql.SQLException;

import org.junit.Test;

import dao.UserDao;

public class ScalarHandlerTest {

	@Test
	public void rightTest() throws SQLException {
		UserDao userDao = new UserDao();
		int count = userDao.getCountByCourse("英语");
		System.out.println(count);
	}
	
	@Test
	public void wrongTest() throws SQLException {
		UserDao userDao = new UserDao();
		int count = userDao.getCountByCourse("体育");
		System.out.println(count);
	}
	
	@Test
	public void nullArgumentsTest() throws SQLException {
		UserDao userDao = new UserDao();
		int count = userDao.getCountByCourse(null);
		System.out.println(count);
	}
	
}
