package com.cg.hbm.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@Table

public class Transactions {
	    @Id
	    @GeneratedValue(strategy =GenerationType.AUTO )
		private int transactionId;
	    private String customerName;
		private double amount;
		
		private String date;
		
		private LocalTime time;
		private String city;
		private String history;
		public Transactions(String customerName, double amount, String date, LocalTime time, String city,
				String history) {
			super();
			this.customerName = customerName;
			this.amount = amount;
			this.date = date;
			this.time = time;
			this.city = city;
			this.history = history;
		}
	
		
		}

