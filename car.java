package javahomework1110;



public class car {
 //variables
	private String make;
	private int speed;
	private boolean drive;

	
	//getters&setters	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean getDrive() {
		return drive;
	}
	public void setDrive(boolean drive) {
		this.drive = drive;
	}
	 
	
//constructors 	
	public car() {}
	
	public car(boolean drive) {
		super();
		this.drive = drive;
	}
	
	private car(String make, int speed, boolean drive) {
		super();
		this.make = make;
		this.speed = speed;
		this.drive = drive;
	}
	private car(int speed, boolean drive) {
		super();
		this.speed = speed;
		this.drive = drive;
	}
	//method returns boolean
	public boolean drive() {
		return true;

		}
	//method returns a string
		
	public void myMake(String make) {
		System.out.println(make);
		}
};



