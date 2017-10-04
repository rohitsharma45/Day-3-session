package com.cg.service.customer;

import com.cg.bean.Controller.CustomerBean;
import com.cg.dao.customer.CustomerDaoImpl;
import com.cg.dao.customer.ICustomerDao;

public class CustomerServiceImpl implements ICustomerService{

	ICustomerDao dao=new CustomerDaoImpl();
	public int addDetails(CustomerBean bean) {
		return dao.addDetails(bean);
	}
	
	

}
