package Car;

import java.util.Scanner;

public class MyCar {
	
	private int odometer;
	private int tackometer;
	private int speedCurrent;
	private final int  YEAR = 2016;
	
	private int[] inGear = {1,2,3,4,5,6,7,8};

	
	private String type = "RC 200t";
	private String model = "Lexus";
	
	static Boolean OnorOff = false; //true = on and false = off
	
	
	public static void main(String[] args){
		System.out.println("Would you like to start your car?");
		turnOn(OnorOff);
		
		if(OnorOff == true) {
			System.out.println("Vrooom, your engine is turned on.");
		}else if(OnorOff == false) {
			System.out.println("Your car isn't started, its not goin anywhere!");
		}
		
	}
	/**
	 * Method to make the car accelerate faster in units of miles per hour
	 * @param x how much your asking the car to accelerate
	 * @return speed the car is traveling
	 */
	public int accelerateSpeed(int x) {
		//TODO: increase by a certain amount
		//TODO: set speedCurrent with increase
		//TODO: return that amount to 		
		
		return x;
	}
	
	/**
	 * Method to make the car slow down in units of miles per hour
	 * @param x how much to slow the car down
	 * @return speed the car is traveling
	 */
	public int brakeSpeed(int x) {
		//TODO: slow down by a certain amount
		//TODO: set speedCurrent to the slowed rate
		//TODO: return that amount to x

		return x;
	}
	
	/**
	 * Method that increases the odometer measured in miles, will not roll back because 
	 * that's naughty and illegal!
	 * @param x the amount of miles to add
	//TODO:CHECK VALIDITY* @return total miles traveled?
	 */
	public int odometerIncrease(int x) {
		//TODO: get speed 
		//TODO: time traveled
		return x;
	}
	
	/**
	 * Method for turning the car on so other attributes can change
	 * @param x is attribute to turn car on or off
	 * @return boolean for true or false, default manually set false so car will be off!
	 */
	public static boolean turnOn(Boolean x) {
		System.out.println("Turn car on? Y/N? ");
		
		Scanner sc = new Scanner(System.in);
		String ignition = sc.nextLine();
		sc.close();
		
		if(ignition.equals("Yes") || ignition.equals("Y") ||ignition.equals("yes") || ignition.equals("y")){
			System.out.println("Car Started!");
			return  OnorOff = true;
		}else if(ignition.equals("No") || ignition.equals("N") || ignition.equals("no") || ignition.equals("n")) {
			System.out.println("Car Not Started!");
			return OnorOff = false;
		}else {
			System.out.println("Unrecognized command");
			return false;
		}
		
	}
	
	//setters and getters block, nothing interesting here
	public String getModel(){return model;}
	public void setModel(String model){this.model = model;}
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}
	public int getYear(){return YEAR;}//NO SETTER, attribute set to FINAL
	public int getSpeedCurrent(){return speedCurrent;}
	public void setSpeedCurrent(int speedCurrent){this.speedCurrent = speedCurrent;}
	public int[] getInGear(){return inGear;}
	public void setInGear(int[] inGear) {this.inGear = inGear;}
	public int getOdometer(){return odometer;}
	public void setOdometer(int odometer){this.odometer = odometer;}
	public int getTackometer() {return tackometer;}
	public void setTackometer(int tackometer) {this.tackometer = tackometer;}

}
