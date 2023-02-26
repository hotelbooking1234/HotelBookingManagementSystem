package com.cg.hbm.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import lombok.Data;

@Data

public class TransactionsDTOResponseActivity {
	private int transactionId;
	private String customerName;
	private double amount;
	private String date;
	private LocalTime time;
	private String city;
	private String history;
	
	private String msg;
}