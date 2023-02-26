export class Review {
    reviewId : number;
    hotelId:number;
    // userName:string;
    starRating : number;
	userReviewMsge : string;
    roomId:number;


    constructor( 
       
    reviewId : number,
    hotelId:number,
	starRating : number,
	userReviewMsge : string,
    roomId:number

   
    ){

        this. reviewId= reviewId;
        // this.userName=userName;
        this.roomId=roomId;
        this.hotelId=hotelId;
        this.starRating=starRating;
        this.userReviewMsge=userReviewMsge;
       
    }
}