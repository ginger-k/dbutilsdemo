package demo;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Test;

import dao.UserDao;

public class MapHandlerTest {

	@Test
	public void rightTest() throws SQLException {
		UserDao userDao = new UserDao();
		Map<String, Object> map = userDao.getMapByLoginnameAndPassword("kuang", "kk");
		System.out.println(ReflectionToStringBuilder.toString(map));
		if (map != null) {
			Set<String> keys = map.keySet();
			for (String key : keys) {
				System.out.println(key+" == "+map.get(key));
			}
		}
	}
	
	@Test
	public void wrongTest() throws SQLException {
		UserDao userDao = new UserDao();
		Map<String, Object> map = userDao.getMapByLoginnameAndPassword("kuang", "kkk");
		System.out.println(ReflectionToStringBuilder.toString(map));
		if (map != null) {
			Set<String> keys = map.keySet();
			for (String key : keys) {
				System.out.println(key+" == "+map.get(key));
			}
		}
	}
	
	@Test
	public void nullArgumentsTest() throws SQLException {
		UserDao userDao = new UserDao();
		Map<String, Object> map = userDao.getMapByLoginnameAndPassword(null, null);
		System.out.println(ReflectionToStringBuilder.toString(map));
		if (map != null) {
			Set<String> keys = map.keySet();
			for (String key : keys) {
				System.out.println(key+" == "+map.get(key));
			}
		}
	}
	
}
