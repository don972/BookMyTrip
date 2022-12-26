package com.FLIGHT_RESERVATION_APP.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.FLIGHT_RESERVATION_APP.Services.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/confirmReservation")
	public String confirmservation(ReservationRequest reservation) {
		
		return "";
	}
}
