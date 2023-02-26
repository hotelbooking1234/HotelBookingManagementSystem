
package com.cg.hbm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class RoomDetailsDTO {

	
	private int roomId;

	private int hotelId;
	private String roomNo;
	private String roomType;
	private double ratePerDay;
	
}