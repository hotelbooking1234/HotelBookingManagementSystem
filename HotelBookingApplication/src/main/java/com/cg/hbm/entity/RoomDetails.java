package com.cg.hbm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "MyRoomDetails")

public class RoomDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roomId;

	private int hotelId;
	private String roomNo;
	private String roomType;
	private double ratePerDay;
	private boolean isAvailable;

	
	public RoomDetails(int hotelId,String roomNo, String roomType, double ratePerDay, boolean isAvailable) {
		super();
		
		this.hotelId=hotelId;
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.ratePerDay = ratePerDay;
		this.isAvailable = isAvailable;
	}
}