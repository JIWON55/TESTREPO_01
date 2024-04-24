package com.example.app.controller.reserv;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.controller.SubController;
import com.example.app.domain.common.dto.ResvDto;


public class ReservAddController implements SubController {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("ResevAddController's execute() invoke");
		
			String method = request.getMethod();
			if(method.contains("GET"))
				try {
					request.getRequestDispatcher("/WEB-INF/view/reservation/add.jsp").forward(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return;
		
		

		
//		//1
//		String reservation_type = request.getParameter("reservation_type");
//		String location = request.getParameter("location");
//		String checkIn = request.getParameter("checkIn");
//		String checkOut = request.getParameter("checkOut");
//		
//		//2
//		if(!isValid(reservation_type,location,checkIn,checkOut)) {
//			return;
//		}
//		
//		//3 
//		ResvDto resvDto = new ResvDto(Boolean.parseBoolean(reservation_type),location,checkIn,checkOut);
//		
//		
//		
//	}
//
//	private boolean isValid(String reservation_type, String location, String checkIn, String checkOut) {
//		if(reservation_type==null || reservation_type.isEmpty()) {
//			return false;
//		}
//		if(location==null || location.isEmpty())
//			return false;
//		if(checkIn==null || checkIn.isEmpty())
//			return false;
//		if(checkOut==null || checkOut.isEmpty())
//			return false;
//		
//		return true;
	}

}
