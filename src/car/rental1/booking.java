package car.rental1;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class booking 
{
   String Username;
   int carno;
   Date date;
   
   booking()
   {
	  Scanner d=new Scanner(System.in);
	  System.out.println("Enter Username: ");
	  Username=d.next();
	  System.out.println("Enter the Car registeration no: ");
	  carno=d.nextInt();
	  System.out.println("Enter date dd-mm-yyyy");
	  String datein=d.next();
	  SimpleDateFormat dateform=new SimpleDateFormat("dd-MM-yyyy");
	  
	  try
	  {
		  date=dateform.parse(datein);
	  }
	  catch(ParseException e)
	  {
		  e.printStackTrace();
	  }
	  
   }
   public boolean isAvailable(ArrayList<booking> bookings,ArrayList<Car> cars)
   {
	   int capacity=0;
	   for(Car car:cars)
	   {
		   if(car.getCarno()== carno)
			   capacity=car.getCapacity();
	   }
	   int count=0;
	   for(booking b:bookings)
	   {
		   if(b.carno==carno && date.equals(date))
		   {
			   count++;
		   }
	   }
	   return count<capacity?true:false;
	   
   }
}
