package com.cg.hbm.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class BookingDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // code to generate PK automatically
	
	
	
	private int bookingId;
	
	
	private int hotelId;
	private int roomId;
	private int userId;
	private String bookedFrom;
	private String bookedTo;
	private int noOfAdults;
	private int noOfChildren;
	private double amount;
	private String name;
	private int PhoneNumber;
	public BookingDetails(int hotelId, int roomId, int userId, String bookedFrom, String bookedTo,
			int noOfAdults, int noOfChildren, double amount,String name,int  PhoneNumber) {
		super();
		
		this.hotelId = hotelId;
		this.roomId = roomId;
		this.userId = userId;
		this.bookedFrom = bookedFrom;
		this.bookedTo = bookedTo;
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
		this.amount = amount;
		this.name=name;
		this.PhoneNumber=PhoneNumber;
	}
	public void setUsers(User user) {
		// TODO Auto-generated method stub
		
	}
	public String getPayments() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}