package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import bean.User;
import utils.JdbcUtil;

public class UserDao {

	public User getUserByLoginnameAndPassword(String loginname, String password) throws SQLException {
		DataSource dataSource = JdbcUtil.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		User u = runner.query("select * from mx_user where loginname = ? and password = ?", new BeanHandler<User>(User.class), loginname, password);
		return u;
	}
	
	public List<User> getUsersByCourse(String course) throws SQLException {
		DataSource dataSource = JdbcUtil.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		List<User> us = runner.query("select * from mx_user where course = ?", new BeanListHandler<User>(User.class), course);
		return us;
	}
	
	
	public Map<String, Object> getMapByLoginnameAndPassword(String loginname, String password) throws SQLException {
		DataSource dataSource = JdbcUtil.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		Map<String, Object> map = runner.query("select * from mx_user where loginname = ? and password =?", new MapHandler(), loginname, password);
		return map;
	}
	
	public List<Map<String, Object>> getMapsByCourse(String course) throws SQLException {
		DataSource dataSource = JdbcUtil.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		List<Map<String, Object>> maps = runner.query("select * from mx_user where course =?", new MapListHandler(), course);
		return maps;
	}
	
	public int getCountByCourse(String course) throws SQLException {
		DataSource dataSource = JdbcUtil.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		Long countL = runner.query("select count(*) from mx_user where course = ?", new ScalarHandler<Long>(), course);
		Integer count = Integer.valueOf(countL.toString());
		return count;
	}
	
	public List<Integer> getIdsByCourse(String course) throws SQLException {
		DataSource dataSource = JdbcUtil.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		List<Integer> ids = runner.query("select * from mx_user where course = ?", new ColumnListHandler<Integer>("id"), course);
		return ids;
	}
	
	public Map<Integer, Map<String, Object>> getIdMapByCourse(String course) throws SQLException {
		DataSource dataSource = JdbcUtil.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		Map<Integer, Map<String, Object>> idMap = runner.query("select * from mx_user where course = ?", new KeyedHandler<Integer>("id"), course);
		return idMap;
	}
	
}
