package com.cg.dao.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.bean.Controller.CustomerBean;
import com.cg.dbutil.customer.DBUtil;

public class CustomerDaoImpl implements ICustomerDao{

	
	public int addDetails(CustomerBean bean) {
	
		int row=0;
		Connection conn=null;
		try{
		conn=DBUtil.getConnection();
		PreparedStatement ps=conn.prepareStatement("insert into BILLDETAILS values(?,?,?,?)");
		ps.setInt(1, bean.getConsumerNo());
		ps.setString(2,bean.getConsumerName());
		ps.setString(3,bean.getConsumerEmail());
		ps.setString(4, bean.getPhoneNo());
		
		row = ps.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return row;
	}

}
