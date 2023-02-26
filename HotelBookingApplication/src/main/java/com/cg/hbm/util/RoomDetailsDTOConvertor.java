package com.cg.hbm.util;

import org.springframework.stereotype.Component;

import com.cg.hbm.dto.RoomDetailsAdminResponseDTO;
import com.cg.hbm.dto.RoomDetailsDTO;
import com.cg.hbm.entity.RoomDetails;

@Component

public class RoomDetailsDTOConvertor {
	
	public RoomDetailsAdminResponseDTO getRoomDetailsAdminResponseDTO(RoomDetails roomDetails)
	{
		RoomDetailsAdminResponseDTO dto = new RoomDetailsAdminResponseDTO();
		
		
		dto.setRoomId(roomDetails.getRoomId());
		dto.setHotelId(roomDetails.getHotelId());
		dto.setRoomNo(roomDetails.getRoomNo());
		dto.setRoomType(roomDetails.getRoomType());
		dto.setRatePerDay(roomDetails.getRatePerDay());
		dto.setMsg("roomDetails saved");
		return dto;
	}
	public RoomDetailsDTO getRoomDetailsDTO(RoomDetails rd)
	{
		RoomDetailsDTO obj= new RoomDetailsDTO( rd.getRoomId(),rd.getHotelId(), rd.getRoomNo(),rd.getRoomType(),rd.getRatePerDay());
		
		return obj;
	}

	
	
}

