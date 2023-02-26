package com.cg.hbm.util;

import org.springframework.stereotype.Component;

import com.cg.hbm.dto.TransactionsDTO;
import com.cg.hbm.dto.TransactionsDTOResponseActivity;
import com.cg.hbm.entity.Transactions;
@Component
public class TransactionsDTOConvertor 
{
	public TransactionsDTOResponseActivity getTransactionsDTOResponseActivity(Transactions transactions)
	{
		TransactionsDTOResponseActivity dto=new TransactionsDTOResponseActivity();
		dto.setTransactionId(transactions.getTransactionId());
		dto.setCustomerName(transactions.getCustomerName());
		dto.setAmount(transactions.getAmount());
		dto.setDate(transactions.getDate());
		dto.setTime(transactions.getTime());
		dto.setCity(transactions.getCity());
		dto.setHistory(transactions.getHistory());
		
		dto.setMsg("Transactions saved");
		return dto;
	}

        public TransactionsDTO getTransactionsDTO(Transactions t)
        {
        	TransactionsDTO obj=new TransactionsDTO(t.getTransactionId(),t.getCustomerName(),t.getAmount(),t.getDate(),t.getTime(),t.getCity(),t.getHistory());
        	return obj;
        }
}
