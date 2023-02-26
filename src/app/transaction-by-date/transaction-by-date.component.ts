import { Component } from '@angular/core';
import { TransactionDTO } from '../transaction-dto';
import { TransactionOperationService } from '../transaction-operation.service';

@Component({
  selector: 'app-transaction-by-date',
  templateUrl: './transaction-by-date.component.html',
  styleUrls: ['./transaction-by-date.component.css']
})
export class TransactionByDateComponent {

  allTransactions:TransactionDTO[] = [];

  constructor(private transactionService:TransactionOperationService)
  {

    console.log("All Transactions")
    transactionService.getAllTransactionFromSpring().subscribe(
      data=>{
        this.allTransactions=data;
      },
      err=>{
        console.log("Error"+err);
      }
    );
  }


  getTransaction1(date:string){
    this.transactionService.getTransactionByDate(date).subscribe(
      data=>{
        console.log("data :- "+data);
        
        this.allTransactions = data;
      },err=>{
        console.log("error from spring ",err);
  
      } 
    );

}
}
