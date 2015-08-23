package demo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Test;

import dao.UserDao;

public class MapListHandlerTest {

	@Test
	public void rightTest() throws SQLException {
		UserDao userDao = new UserDao();
		List<Map<String, Object>> maps = userDao.getMapsByCourse("英语");
		System.out.println(ReflectionToStringBuilder.toString(maps));
		for (Map<String, Object> map : maps) {
			System.out.println(ReflectionToStringBuilder.toString(map));
		}
	}
	
	@Test
	public void wrongTest() throws SQLException {
		UserDao userDao = new UserDao();
		List<Map<String, Object>> maps = userDao.getMapsByCourse("物理");
		System.out.println(ReflectionToStringBuilder.toString(maps));
		for (Map<String, Object> map : maps) {
			System.out.println(ReflectionToStringBuilder.toString(map));
		}
	}
	
	@Test
	public void nullArgumentsTest() throws SQLException {
		UserDao userDao = new UserDao();
		List<Map<String, Object>> maps = userDao.getMapsByCourse(null);
		System.out.println(ReflectionToStringBuilder.toString(maps));
		for (Map<String, Object> map : maps) {
			System.out.println(ReflectionToStringBuilder.toString(map));
		}
	}
	
}
