package demo;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Test;

import dao.UserDao;

public class ColumnListHandlerTest {

	@Test
	public void rightTest() throws SQLException {
		UserDao userDao = new UserDao();
		List<Integer> ids = userDao.getIdsByCourse("英语");
		System.out.println(ReflectionToStringBuilder.toString(ids));
		for (Integer id : ids) {
			System.out.println(id);
		}
	}
	
	@Test
	public void wrongTest() throws SQLException {
		UserDao userDao = new UserDao();
		List<Integer> ids = userDao.getIdsByCourse("体育");
		System.out.println(ReflectionToStringBuilder.toString(ids));
		for (Integer id : ids) {
			System.out.println(id);
		}
	}
	
	@Test
	public void nullArgumentsTest() throws SQLException {
		UserDao userDao = new UserDao();
		List<Integer> ids = userDao.getIdsByCourse("体育");
		System.out.println(ReflectionToStringBuilder.toString(ids));
		for (Integer id : ids) {
			System.out.println(id);
		}
	}
	
}
