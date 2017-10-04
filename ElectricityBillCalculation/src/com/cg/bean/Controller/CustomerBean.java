package com.cg.bean.Controller;

public class CustomerBean {

	private int consumerNo;
	private String consumerName;
	private String consumerEmail;
	private String phoneNo;

	
	public CustomerBean(){
		
	}


	public CustomerBean(int consumerNo, String consumerName,
			String consumerEmail, String phoneNo) {
		super();
		this.consumerNo = consumerNo;
		this.consumerName = consumerName;
		this.consumerEmail = consumerEmail;
		this.phoneNo = phoneNo;
	}


	public int getConsumerNo() {
		return consumerNo;
	}


	public void setConsumerNo(int consumerNo) {
		this.consumerNo = consumerNo;
	}


	public String getConsumerName() {
		return consumerName;
	}


	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}


	public String getConsumerEmail() {
		return consumerEmail;
	}


	public void setConsumerEmail(String consumerEmail) {
		this.consumerEmail = consumerEmail;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	



	
	
	

	
	
	
}
