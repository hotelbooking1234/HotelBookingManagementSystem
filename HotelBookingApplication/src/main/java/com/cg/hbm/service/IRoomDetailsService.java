package com.cg.hbm.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.cg.hbm.entity.RoomDetails;
import com.cg.hbm.exception.RoomDetailsIdNotFoundException;
@Service
public interface IRoomDetailsService {

	public RoomDetails addRoomDetails(RoomDetails roomDetails) throws Exception;
	
	 public List<RoomDetails> getRoomsByHotelId(int hotelId);
		
		public List<RoomDetails> getAllRooms();
	
	

	
}