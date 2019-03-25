package net.utility;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Component;

@Component
public class DBOpen { // 데이터베이스 연결
	public DBOpen() {
		System.out.println("-----DBOpen() 객체 생성");
	}

	public Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/lnr67?serverTimezone=UTC"; 
		String user = "lnr67";
		String password = "snnu!9310@";
		String driver = "com.mysql.cj.jdbc.Driver";
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("DB연결 실패 : " + e);
		} // try end
		return con;
	}// end
}// class end
