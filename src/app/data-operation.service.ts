import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserLoginDTO } from './user';

interface AppUser{
  username:string;
  password:string;
  role:string;
  photo:string;
 
}

@Injectable({
  providedIn: 'root'
})
export class DataOpeartionService {

  baseURL = 'http://localhost:2004';
  loginURL : string = this.baseURL+'/user/login/';
  allAppUsers:AppUser[] = [];
  
  constructor(private http:HttpClient) { 
    let user1:AppUser = {
      username:"Rasagnya",
      password : "123",
      role:"User",
      photo:"user.jpg"
    }
    let user2:AppUser = {
      username:"Monisha",
      password : "123",
      role:"User",
      photo:"user.jpg"
    }
    let user3:AppUser = {
      username:"Pravalika",
      password : "123",
      role:"User",
      photo:"user.jpg"
    }
    let user4:AppUser = {
      username:"Tejaswini",
      password : "123",
      role:"User",
      photo:"user.jpg"
    }
    let user5:AppUser = {
      username:"Riebikshana",
      password : "123",
      role:"User",
      photo:"user.jpg"
    }
    let user6:AppUser = {
      username:"admin",
      password : "admin",
      role:"admin",
      photo:"admin.jpg"
    }

    this.allAppUsers = [user1,user2,user3,user4,user5,user6];


  }

doSpringLogin(userId:string,password:string):Observable<UserLoginDTO>
{
  let a:string = this.loginURL+userId+'/'+password;
  return this.http.get<UserLoginDTO>(`${a}`);


}


  doLogin(ipUsername:string,ipPassword:string):boolean
  {
    localStorage.removeItem('username')
    localStorage.removeItem('role')
    localStorage.removeItem('loginStatus')
    localStorage.removeItem('photo')
     
    console.log("inside Service : "+ipUsername+" & "+ipPassword);
   
    for(let i=0;i<this.allAppUsers.length;i++)
    {
       let thisUser:AppUser = this.allAppUsers[i];

       if(thisUser.username == ipUsername && thisUser.password == ipPassword)
       {

          localStorage.setItem("username",ipUsername);
          localStorage.setItem("role",thisUser.role);
          localStorage.setItem("loginStatus",true+'');
          localStorage.setItem("photo",thisUser.photo);
          
          console.log("inside service for true ");
          
          return true; // note the break is not applicable in forEach because of window property
       }

    }
    return false;
    
  } //end of doLogin

  doUserLogout()
  {
    localStorage.removeItem('username')
    localStorage.removeItem('role')
    localStorage.removeItem('loginStatus')
    localStorage.removeItem('photo')

    console.log("inside Service logout ");

  }

}