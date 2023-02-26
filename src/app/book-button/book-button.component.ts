import { Component } from '@angular/core';
import { Booking } from '../booking';
import { BookingOperationService } from '../booking-operation.service';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { BookingDTO } from '../booking-dto';
@Component({
  selector: 'app-book-button',
  templateUrl: './book-button.component.html',
  styleUrls: ['./book-button.component.css']
})
export class BookButtonComponent {
  today: string = new Date().toISOString().slice(0, 10);
  model:  Booking = new  Booking(0,'',0,0,0,0,0,0,0);
  submitted = false;
  success = false;
  error = false;
  
  status = false;
  message = '';
  router:Router;
  allBookings: BookingDTO[]=[];
  allreviews: BookingDTO[]=[];
  constructor(private bookingService:BookingOperationService,router:Router,private activatedRouter:ActivatedRoute) {
    this.router=router;
  }

  onSubmit() {
    this.bookingService.addBooking(this.model).subscribe(

      data=>{
        this.status=true;
        this.message="Booking submitted";

      },
      error=>{

      }
      // this.navigate(['bookingdetails']);
      

    );
    //this.router.navigate(['bookingdetails']);

 
  }
  // viewdetails(booking:number){
    
  //   this.bookingService.getBookingsById(booking).subscribe(
  //     data=>{
  //         console.log(" Data Saved !!! "+data);
  //         this.allBookings=data;
  //     },
  //     error => {
  //       console.log(error);
        
  //     }
  //    );
     
    
    
  // }

  


}

