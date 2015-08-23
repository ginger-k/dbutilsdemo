package demo;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		DataSource dataSource=new ComboPooledDataSource();
		Connection conn=dataSource.getConnection();//得到连接
		conn.close();//方法被重写，不关闭，放回到连接池集合
		System.out.println(conn);
	}
}
