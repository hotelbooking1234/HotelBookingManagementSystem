package com.cg.hbm.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hbm.dto.BookingDetailsDTO;
import com.cg.hbm.dto.BookingDetailsResponseDTO;
import com.cg.hbm.entity.BookingDetails;
import com.cg.hbm.exception.BookingDetailsNotFoundException;
import com.cg.hbm.service.IBookingDetailsService;
import com.cg.hbm.util.BookingDetailsDTOConvertor;

@RestController
@RequestMapping("/booking")

@CrossOrigin(origins= {"http://localhost:4200","http://localhost:2004"},allowedHeaders="*")


public class BookingDetailsController {
	@Autowired
	IBookingDetailsService bookingService;
	@Autowired
	BookingDetailsDTOConvertor bookingDetailsDTOConvertor;
	@PostMapping("/add")
	public ResponseEntity<BookingDetails>addBookingDetails(@RequestBody BookingDetails cBookingDetails)throws BookingDetailsNotFoundException{
		BookingDetails newBookingDetails=bookingService.addBookingDetails(cBookingDetails);
		BookingDetailsResponseDTO responseDTO=bookingDetailsDTOConvertor.getBookingDetailsResponseDTO(newBookingDetails);
		return new ResponseEntity<BookingDetails>(newBookingDetails,HttpStatus.OK);
	}
@PutMapping("/updateBookingDetails/{bookingId}")
public String updateBookingDetails(@PathVariable int bookingId) throws BookingDetailsNotFoundException{
	BookingDetails updatedBookingDetails=bookingService.getBookingDetailsBybookingId(bookingId);
	return updatedBookingDetails.toString();
	
}
@DeleteMapping("/booking/delete/{bID}")
public ResponseEntity<BookingDetails>deleteBookingDetails(@PathVariable Integer bID) throws BookingDetailsNotFoundException{
	if(bID==null) {
		throw new BookingDetailsNotFoundException("No Booking exists with this key");
	}
	else {
	BookingDetails deletedBookingDetails=bookingService.deleteBookingDetails(bID);
	return new ResponseEntity<BookingDetails>(deletedBookingDetails,HttpStatus.OK);
}
}
@GetMapping("/booking/view/{bID}")

public ResponseEntity<BookingDetails>viewDetails(@PathVariable Integer bID)throws BookingDetailsNotFoundException{
	BookingDetails viewBookingDetails=bookingService.deleteBookingDetails(bID);
	return new ResponseEntity<BookingDetails>(viewBookingDetails,HttpStatus.OK);
}
@GetMapping("/bookings")
public ResponseEntity<List<BookingDetailsDTO>> getAllBookingDetails()throws BookingDetailsNotFoundException{
	List<BookingDetails> allbookingDetails = bookingService.getAllBookingDetails();
	List<BookingDetailsDTO> allBookingDetailsDTO=new ArrayList<>();
	for (BookingDetails bookingDetails:allbookingDetails) {
		allBookingDetailsDTO.add(bookingDetailsDTOConvertor.getBookingDetailsDTO(bookingDetails));
	}
	return new ResponseEntity<List<BookingDetailsDTO>>(allBookingDetailsDTO,HttpStatus.OK);
	}

@GetMapping("/byBookedFrom/{bookedFrom}")
public ResponseEntity<List<BookingDetailsDTO>> getBookingsByBookedFrom(@PathVariable String bookedFrom) throws Exception {
List<BookingDetails> allBookings = bookingService.getBookingsByBookedFrom(bookedFrom);
List<BookingDetailsDTO> allBookingsDTO = new ArrayList<>();
for (BookingDetails bookingDetails : allBookings)
allBookingsDTO.add(bookingDetailsDTOConvertor.getBookingDetailsDTO(bookingDetails));
return new ResponseEntity<List<BookingDetailsDTO>>(allBookingsDTO, HttpStatus.OK);
}



@GetMapping("/bookingId/{bookingId}")
public ResponseEntity<BookingDetailsDTO> findByBookingId(@PathVariable int bookingId){
BookingDetails bookingDetails =bookingService.findByBookingId(bookingId);
BookingDetailsDTO dtoObj = bookingDetailsDTOConvertor.getBookingDetailsDTO(bookingDetails);
return new ResponseEntity<BookingDetailsDTO>(dtoObj, HttpStatus.OK);
}


}
