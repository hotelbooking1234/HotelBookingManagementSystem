import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Transaction } from './transaction';
import { HttpClient } from '@angular/common/http';
import { TransactionDTO } from './transaction-dto';

@Injectable({
  providedIn: 'root'
})
export class TransactionOperationService {
  baseURL:string = 'http://localhost:2004';

  allTransactionEndpoint = this.baseURL+'/transactions/allTransactions';

  addTransactionEndPoint:string=this.baseURL+'/transactions/add';

  transactionByDateEndPoint = this.baseURL + '/transactions/transactionsBydate';

  transactionByIdEndPoint = this.baseURL + '/transactions/id';

  transactionArr:TransactionDTO[] = [];

  constructor(private http:HttpClient) {}

  addTransaction(transaction:Transaction):Observable<Transaction>
  {
  console.log("inside method 1 : Transaction Added" + transaction);

  return this.http.post<Transaction>(`${this.addTransactionEndPoint}`,transaction);

 }

 getAllTransactionFromSpring():Observable<TransactionDTO[]>
  {
    console.log("inside service : "+this.allTransactionEndpoint);

    return this.http.get<TransactionDTO[]>(`${this.allTransactionEndpoint}`);
}

  
   getTransactionByDate(date: string): Observable<TransactionDTO[]> {
    console.log("Inside Method 1 " + this.transactionByDateEndPoint);
    this.transactionByDateEndPoint = this.transactionByDateEndPoint + '/' + date;
    console.log("After adding date 2 " + this.transactionByDateEndPoint);

    return this.http.get<TransactionDTO[]>(`${this.transactionByDateEndPoint}`);
  }

  getTransactionById(id: number): Observable<TransactionDTO[]> {
    console.log("Inside Method 1 " + this.transactionByIdEndPoint);
    this.transactionByIdEndPoint = this.transactionByIdEndPoint + '/' + id;
    console.log("After adding date 2 " + this.transactionByDateEndPoint);

    return this.http.get<TransactionDTO[]>(`${this.transactionByIdEndPoint}`);
  }
  }