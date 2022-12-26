package com.FLIGHT_RESERVATION_APP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.FLIGHT_RESERVATION_APP.Services.ReservationService;
import com.FLIGHT_RESERVATION_APP.dto.ReservationRequest;
import com.FLIGHT_RESERVATION_APP.entity.Reservation;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/confirmReservation")
	public String confirmReservation(ReservationRequest request, ModelMap modelMap) {
		Reservation reservationId = reservationService.bookFlight(request);
		modelMap.addAttribute("reservationId", reservationId);
		return"confirmReservation";
	}

}
