package com.cg.Servlet.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.Controller.CustomerBean;
import com.cg.service.customer.CustomerServiceImpl;
import com.cg.service.customer.ICustomerService;

@WebServlet("*.obj")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String target=null;
		CustomerBean bean=new CustomerBean();
		ICustomerService service=new CustomerServiceImpl();
		String path=request.getServletPath();
		switch(path)
		{
		case "/customer.obj":
			String consumerNo=request.getParameter("conNo");
			int consNo=Integer.parseInt(consumerNo);
			String consumerName=request.getParameter("conName");
			String consumerEmail=request.getParameter("conEmail");
			String consumerPhone=request.getParameter("conPhone");	
			bean.setConsumerNo(consNo);
			bean.setConsumerName(consumerName);
			bean.setConsumerEmail(consumerEmail);
			bean.setPhoneNo(consumerPhone);
			int res=service.addDetails(bean);
			if(res==1)
			{
				target="Success.html";
			}
			else {
				target="Error.html";
			}
			break;
		}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
	}

}
