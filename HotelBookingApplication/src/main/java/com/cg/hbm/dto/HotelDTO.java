package com.cg.hbm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDTO {
	
	private int hotelId;
	private String city;
	private String hotelName;
	private String address;
	private String imageName;
	private String description;
	private double avgRatePerDay;
	private String email;
	private String phone;
	private String website;
	private int starRating;
	
	
	
	

}
