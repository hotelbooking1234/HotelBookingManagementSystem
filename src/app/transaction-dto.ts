export class TransactionDTO {
    id : number;
    customerName:string;
   date:number;
   time:number;
   amount:number;

   constructor(
    id : number,
    customerName:string,
   date:number,
   time:number,
   amount:number,
   )

   {
    this.id=id;
    this.customerName=customerName;
   this.date=date;
   this.time=time;
   this.amount=amount;
   }
   
}
