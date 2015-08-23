package demo;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Test;

import dao.UserDao;

public class KeyedHandlerTest {

	@Test
	public void rightTest() throws SQLException {
		UserDao userDao = new UserDao();
		Map<Integer, Map<String, Object>> map = userDao.getIdMapByCourse("英语");
		System.out.println(ReflectionToStringBuilder.toString(map));
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key+" == "+map.get(key));
		}
	}
	
	@Test
	public void wrongTest() throws SQLException {
		UserDao userDao = new UserDao();
		Map<Integer, Map<String, Object>> map = userDao.getIdMapByCourse("体育");
		System.out.println(ReflectionToStringBuilder.toString(map));
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key+" == "+map.get(key));
		}
	}
	
}
