import { Component } from '@angular/core';
import { BookingDTO } from '../booking-dto';
import { BookingOperationService } from '../booking-operation.service';
@Component({
  selector: 'app-booking-dto',
  templateUrl: './booking-dto.component.html',
  styleUrls: ['./booking-dto.component.css']
})
export class BookingDtoComponent {
  allBooking:BookingDTO[]=[];

  constructor(private bookingService:BookingOperationService)
  {

    console.log("All Bookings")
    bookingService.getAllBookingFromSpring().subscribe(
      data=>{
        this.allBooking=data;
      },
      err=>{
        console.log("Error"+err);
      }
    );
  }

  getBooking1(bookingId:string){
    this.bookingService.getBookingById(parseInt(bookingId)).subscribe(
      data=>{
        console.log("data :- "+data);
        
        this.allBooking = data;
      },err=>{
        console.log("error from spring ",err);
  
      } 
    );
  }



}

