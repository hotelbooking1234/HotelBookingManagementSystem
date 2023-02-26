package com.cg.hbm.dto;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Data
public class BookingDetailsResponseDTO {
	private int bookingId;
	
	private String bookedFrom;
	private String bookedTo;
	private int noOfAdults;
	private int noOfChildren;
	private double amount;
	private String msg;
	private String name;
	private int PhoneNumber;
	private int hotelId;
	private int roomId;
	private int userId;
}