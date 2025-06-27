import java.util.*;
public class BusBooking{
    static int  cnt = 0 ; 
    static int seatcount = 0 ; 
    public static void book(){
        // BusBooking.cnt += 20 ; 
        if(BusBooking.seatcount == 20 )
        {
            System.out.println(" ALL SEATS ARE ALREADY BOOKED "  ); 
            return ; 
        }
        BusBooking.seatcount++; 
        BusBooking.cnt += 20 ; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("WELCOME TO THE PUBLIC BUS TICKET BOOKING APPLICATION : ") ; 
        while(true){
            System.out.println("PRESS 1 TO BOOK TICKET ( PRICE 20 RS. ):  ") ; 
            System.out.println( "PRESS 2 TO CHEACK THE AMOUNT TO BE PAYED AND THE NUMBER OD SEATS BOOKED:") ; 
            System.out.println("PRESS 3 TO EXIT : " ) ; 
            byte b = sc.nextByte() ; 
            if(b ==1  ){
                book();
            }
            else if( b == 3 ){
                break ; 
            }
            else if(b == 2 ){
                System.out.println("YOU HAVE BOOKED " + BusBooking.seatcount + " SEATS  AND YOUR TOTAL AMOUNT IS  : "+ BusBooking.cnt ) ; 
            }
            else{
                System.out.println("INVALID INPUT, TRY AGAIN");
            }
        }
    }
}