import { Component } from '@angular/core';
import { TransactionDTO } from '../transaction-dto';
import { TransactionOperationService } from '../transaction-operation.service';

@Component({
  selector: 'app-transaction-by-id',
  templateUrl: './transaction-by-id.component.html',
  styleUrls: ['./transaction-by-id.component.css']
})
export class TransactionByIdComponent {
  TransactionById:TransactionDTO[] = [];
  allTransactions: TransactionDTO[] =[];

  constructor(private transactionService:TransactionOperationService)
  {

    console.log("All TransactionById")
    transactionService.getAllTransactionFromSpring().subscribe(
      data=>{
        this.TransactionById=data;
      },
      err=>{
        console.log("Error"+err);
      }
    );
  }


  getTransaction2(id:string){
    this.transactionService.getTransactionById(parseInt(id)).subscribe(
      data=>{
        console.log("data :- "+data);
        
        this.allTransactions = data;
      },err=>{
        console.log("error from spring ",err);
  
      } 
    );

}
}
