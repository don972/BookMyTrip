package com.FLIGHT_RESERVATION_APP.Services;

import com.FLIGHT_RESERVATION_APP.dto.ReservationRequest;
import com.FLIGHT_RESERVATION_APP.entity.Reservation;

public interface ReservationService {
	Reservation bookFlight(ReservationRequest request);
}
