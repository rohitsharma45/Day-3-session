package com.cg.dbutil.customer;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBUtil {

	static Connection conn=null;
	public static Connection getConnection(){
		try{
			InitialContext ic = new InitialContext();
			DataSource ds=(DataSource) ic.lookup("java:/jdbc/OracleDS");
			conn=ds.getConnection();
		}
		catch(SQLException e){
			
		}
		catch(NamingException e){
			
		}
		return conn;
	}
}
