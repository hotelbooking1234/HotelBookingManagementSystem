package com.cg.hbm.service;

import com.cg.hbm.entity.Transactions;
import com.cg.hbm.exception.InvalidInputDataException;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface TransactionsService {

	Transactions addTransactions(Transactions transactions);
	List<Transactions> getAllTransactions();
	
// TODO Auto-generated method stubList<Booking> allBookings = bookingRepository.findAll();List<Booking> requiredBookings = new ArrayList<>();for (Booking obj : allBookings) {if (obj.getDateOfBooking().equalsIgnoreCase(dateOfBooking)) {requiredBookings.add(obj);}



	
	List<Transactions> getTransactionsByTransactionId(int transactionId) throws InvalidInputDataException;
	List<Transactions> getTransactionsByDate(String date);
	

}
