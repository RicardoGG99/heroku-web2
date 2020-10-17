package helpers;


import java.sql.Connection;




import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	//Attributes
	private static String DBurl = "jdbc:postgresql://ec2-52-203-165-126.compute-1.amazonaws.com:5432/dati5o9elojvcr";
	private static String DBuser = "qzidgwiwnwicpc";
	private static String DBpassword = "7efbdc4399e53ce0b8fc30745367df40cb5984c9b66b72c8086456224b263d48";
	private static String DBdriver = "org.postgresql.Driver";
	private static Connection conn = null;
	
	//Methods

	public Connection getConnection() {
		try {
			if(conn == null) {
			Class.forName(DBdriver);
			conn = DriverManager.getConnection(DBurl, DBuser, DBpassword);
			System.out.println("Conexion Exitosa");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
}

