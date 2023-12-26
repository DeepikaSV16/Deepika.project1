package car.rental1;

public class Car 
{
	private int carno;
	private boolean ac;
	private int capacity;
	 
	Car(int no,boolean ac,int cap)
	{
		this.carno=no;
		this.ac=ac;
		this.capacity=cap;
	}
     public int getCarno()
     {
    	 return carno;
     }
	 public boolean isAc()
	 {
		return ac;
	 }
	 public int getCapacity()//accessor
	 {
		 return capacity;
	 }
	 
	 public void setAc(boolean val)
	 {
		 ac=val;
	 }
	 
	 public void setCapacity(int cap)//mutator
	 {
		 capacity=cap;
	 }
	 public void displayCarInfo()
	 {
		 System.out.println("Car no: "+carno+" Ac: "+ac+" Total capacity of the car: "+capacity);
	 }
	 
}
