import { Component } from '@angular/core';
import { TransactionDTO } from '../transaction-dto';
import { TransactionOperationService } from '../transaction-operation.service';

@Component({
  selector: 'app-transaction-list',
  templateUrl: './transaction-list.component.html',
  styleUrls: ['./transaction-list.component.css']
})
export class TransactionListComponent {
  allTransaction:TransactionDTO[] = [];
  constructor(transactionService:TransactionOperationService)
  {
    transactionService. getAllTransactionFromSpring().subscribe(
      data=>{
        this.allTransaction = data;
      },
      err=>{
        console.log("Error" +err);
      }
    );
  }

}