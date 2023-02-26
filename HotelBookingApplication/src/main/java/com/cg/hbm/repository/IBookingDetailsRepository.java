package com.cg.hbm.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hbm.entity.BookingDetails;
@Repository
public interface IBookingDetailsRepository extends JpaRepository<BookingDetails, Integer> {

	BookingDetails findByBookingId(int bookingId);

	//List<BookingDetails> getBookingByBookedFrom(LocalDate bookedFrom);

  //List<BookingDetails> getBookingsbyDate(LocalDate date);

//	List<BookingDetails> findByDate(LocalDate date);
	
	List<BookingDetails> getBookingsByBookedFrom(String bookedFrom);
	
}
