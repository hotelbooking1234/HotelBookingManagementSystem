export class Room {
    
    roomNo:string;
    
    hotelId:number;
    
    roomType:string;
   ratePerDay:number;
   imageName:string;
   isAvailable:string;
   
   

   constructor( roomNo:string,hotelId:number,
   
    roomType:string,
    ratePerDay:number,
    imageName:string,
    isAvailable:string,
    ){

       
   this.roomNo=roomNo;
   this.hotelId=hotelId;
   
   this.roomType=roomType;
   this.ratePerDay=ratePerDay;
   this.imageName=imageName;
   this.isAvailable=isAvailable;
   
   

    }
}