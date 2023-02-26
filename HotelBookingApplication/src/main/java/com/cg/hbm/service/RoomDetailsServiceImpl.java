package com.cg.hbm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.hbm.entity.RoomDetails;
import com.cg.hbm.repository.IRoomDetailsRepository;

@Service
public class RoomDetailsServiceImpl implements IRoomDetailsService {

	@Autowired
	private IRoomDetailsRepository roomDetailsRepo;
	
	@Override
	public RoomDetails addRoomDetails(RoomDetails roomDetails) {
		
			return roomDetailsRepo.save(roomDetails);
	}
	
	@Override
	public  List<RoomDetails> getAllRooms(){
		return roomDetailsRepo.findAll();
	}
	
	@Override
	public List<RoomDetails> getRoomsByHotelId(int hotelId){
		
		return roomDetailsRepo.getRoomsByHotelId(hotelId);
	}
	
	
}