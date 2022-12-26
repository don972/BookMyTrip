package com.FLIGHT_RESERVATION_APP.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FLIGHT_RESERVATION_APP.dto.ReservationRequest;
import com.FLIGHT_RESERVATION_APP.entity.Flight;
import com.FLIGHT_RESERVATION_APP.entity.FlightRepository;
import com.FLIGHT_RESERVATION_APP.entity.Passenger;
import com.FLIGHT_RESERVATION_APP.entity.PassengerRepository;
import com.FLIGHT_RESERVATION_APP.entity.Reservation;
import com.FLIGHT_RESERVATION_APP.entity.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	

	@Override
	public Reservation bookFlight(ReservationRequest request) {
//		String firstName = request.getFirstName();
//		String lastName = request.getLastName();
//		String middleName = request.getMiddleName();
//		String email = request.getEmail();
//		String phone = request.getPhone();
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		
		
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		
		reservationRepo.save(reservation);
		
		return reservation;
	}

}
