package car.rental1;
import java.util.Scanner;
import java.util.ArrayList;
public class demo
{
     public static void main(String[]args)
     {
    	 ArrayList<Car> cars=new ArrayList<Car>();
    	 ArrayList<booking> bookings=new ArrayList<booking>();
    	 
    	 cars.add(new Car(1001,true,2));
    	 cars.add(new Car(1002,false,6));
    	 cars.add(new Car(1003,true,4));
    	 
    	 int userselect=1;
    	 Scanner d=new Scanner(System.in);
    	 
    	 for(Car c:cars)
    	 {
    		 c.displayCarInfo();
    	 }
    	 
    	 while(userselect==1)
    	 {
    		 System.out.println("Enter 1 for booking or 2 for exit");
    		 userselect=d.nextInt();
    		 if(userselect==1)
    		 {
    			 booking book=new booking();
    			 if(book.isAvailable(bookings,cars))
    			 {
    				 bookings.add(book);
    				 System.out.println("Booking is confirmed!");
    			 }
    			 else
    			 {
    				 System.out.println("Sorry that Car is not Available. Kindly please try another! ");
    			 }
    		 }
    	 }
     }
}
