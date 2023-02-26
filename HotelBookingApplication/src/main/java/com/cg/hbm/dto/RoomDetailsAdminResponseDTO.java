package com.cg.hbm.dto;

import lombok.Data;

@Data

public class RoomDetailsAdminResponseDTO {
	private int roomId;

	private int hotelId;
	private String roomNo;
	private String roomType;
	private double ratePerDay;
	private String msg;
	
	
}
