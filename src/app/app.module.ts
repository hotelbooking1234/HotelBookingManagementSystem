import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import{FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminWorkComponent } from './admin-work/admin-work.component';
import { HotelDetailComponent } from './hotel-detail/hotel-detail.component';

import { BookingDetailsComponent } from './booking-details/booking-details.component';
import { ReviewComponent } from './review/review.component';
import { RoomsComponent } from './rooms/rooms.component';
import { HotelComponent } from './hotel/hotel.component';
import { TransactionsComponent } from './transactions/transactions.component';
import { RouterModule, Routes } from '@angular/router';
import { UserComponent } from './user/user.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { InfoPipeComponent } from './info-pipe/info-pipe.component';
import { InfoPipe } from './info-pipe';
import { HotelListComponent } from './hotel-list/hotel-list.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdminBookingComponent } from './admin-booking/admin-booking.component';
import { RoomDetailsComponent } from './room-details/room-details.component';
import { BookButtonComponent } from './book-button/book-button.component';
import { BookingDtoComponent } from './booking-dto/booking-dto.component';
import { ViewReviewComponent } from './view-review/view-review.component';
import { TransactionByDateComponent } from './transaction-by-date/transaction-by-date.component';
import { TransactionByIdComponent } from './transaction-by-id/transaction-by-id.component';
import { TransactionListComponent } from './transaction-list/transaction-list.component';
import { TransactionComponent } from './transaction/transaction.component';
import { LoginComponent } from './login/login.component';
import { AboutComponent } from './about/about.component';
import { ViewByIdComponent } from './view-by-id/view-by-id.component';

const allLinks:Routes = [
  {path:'home',component:HomeComponent},
  {path:'about',component:AboutComponent},
  {path:'login',component:LoginComponent},

  {path:'launchhotel',component:AdminWorkComponent},
  {path:'hotels',component:HotelComponent},
  {path:'search',component:HotelDetailComponent},
  {path:'listhotels',component:UserComponent},

  {path:'addroom',component:RoomDetailsComponent},
  {path:'view-room',component: RoomsComponent},
  {path:'bookingform',component:BookButtonComponent},
  {path:'bookingbyId',component:ViewByIdComponent},

  {path:'bookingdetails',component: BookingDetailsComponent },
  //{path:'mybookings',component: BookingDtoComponent},
  //{path:'hotelDetail/:hid',component:SearchHotelComponent},
  
  {path:'addtransaction',component:TransactionComponent},
  {path:'viewtransactionDetails',component:TransactionListComponent},
  {path:'transactions',component:TransactionsComponent},
  {path:'transactionsByDate',component:TransactionByDateComponent},
  {path:'transactionsByid',component:TransactionByIdComponent},

  {path:'review',component:ReviewComponent},
  {path:'viewReviews',component:ViewReviewComponent},
]

@NgModule({
  declarations: [
    AppComponent,
    AdminWorkComponent,
    HotelDetailComponent,
    BookingDetailsComponent,
    ReviewComponent,
    RoomsComponent,
    HotelComponent,
    TransactionsComponent,
    UserComponent,
    HeaderComponent,
    HomeComponent,
    InfoPipeComponent,
    InfoPipe,
    HotelListComponent,
    AdminBookingComponent,
    RoomDetailsComponent,
    BookButtonComponent,
    BookingDtoComponent,
    ViewReviewComponent,
    TransactionByDateComponent,
    TransactionByIdComponent,
    TransactionListComponent,
    TransactionComponent,
    LoginComponent,
    ViewByIdComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,RouterModule.forRoot(allLinks),FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
