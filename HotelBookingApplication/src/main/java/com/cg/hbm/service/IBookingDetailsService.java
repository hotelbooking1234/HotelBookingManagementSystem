package com.cg.hbm.service;


import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hbm.entity.BookingDetails;
import com.cg.hbm.exception.BookingDetailsNotFoundException;
@Service
public interface IBookingDetailsService {
	public BookingDetails addBookingDetails(BookingDetails bookingDetails) throws BookingDetailsNotFoundException;
	public BookingDetails updateBookingDetails(int bookingId)throws BookingDetailsNotFoundException;
	public BookingDetails deleteBookingDetails(int bookingId)throws BookingDetailsNotFoundException;
	public List<BookingDetails> getAllBookingDetails()throws BookingDetailsNotFoundException;
	public BookingDetails getBookingDetailsBybookingId(int bookingId) throws BookingDetailsNotFoundException;
//	//public List<BookingDetails>getBookingsbyDate(LocalDate date);
//	
//	 List<BookingDetails>getBookingsbyBookedFrom(LocalDate bookedFrom);
	BookingDetails findByBookingId(int bookingId);
	List<BookingDetails> getBookingsByBookedFrom(String bookedFrom);
	//List<BookingDetails> getBookingByBookedFrom(LocalDate bookedFrom);
}