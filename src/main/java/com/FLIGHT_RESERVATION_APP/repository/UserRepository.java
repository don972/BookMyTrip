package com.FLIGHT_RESERVATION_APP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FLIGHT_RESERVATION_APP.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String emailId);

	

}
