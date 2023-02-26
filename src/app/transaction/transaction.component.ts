import { Component } from '@angular/core';
import { Transaction } from '../transaction';
import { TransactionDTO } from '../transaction-dto';
import { TransactionOperationService } from '../transaction-operation.service';


@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent {

  today: string = new Date().toISOString().slice(0, 10);
  t:Transaction = new Transaction(0,'',0,0,0);
  submitted = false;
  success = false;
  error = false;
  status = false;
  message = '';
  allTransactions:TransactionDTO[]=[]

  constructor(private transactionservice: TransactionOperationService) {}
  onSubmit() {

    this.transactionservice.addTransaction(this.t).subscribe(
      data=>{
        this.status=true;
        this.message="Transaction added";
      },
      error=>{
      }
    );
  }

}