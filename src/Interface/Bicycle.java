package Interface;

public class Bicycle implements Vehicle {

	int speed;
	int gear;
	//to change gear
	@Override
	public void changeGeer(int newGear) {
		gear=newGear;
	}
	@Override
	public void applyBrakes(int decrement) {
		speed=speed-decrement;
		
	}
	 public void printStates() {
	        System.out.println("speed: " + speed
     + " gear: " + gear);
}
	 
	  
	}


