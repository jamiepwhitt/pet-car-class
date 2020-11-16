/*Assignment: pet.java
Create a Pet Class with the following instance variables:
 name (PRIVATE)
age (PRIVATE)
location (PRIVATE)
type (PRIVATE)
and two constructors. Empty all attributes.
STEP 1. Code to be able to access the following (Get Methods): name, age, and type
STEP 2. Code to be able to change the following methods (Set Methods): name, age, location
STEP 3. Create a Custom Class (anything you want - car, phone, holiday, etc.). REQUIREMENTS:
* Minimum 3 private instance variables
* An empty constructor
* A constructor that uses only 2 of your 3 variables
* A constructor that uses all 3 of your instance variables
* Get methods for all 3 of your instance variables
* Set methods for all 3 of your instance variables
* A method that returns a Boolean A method that returns a String*/

package javahomework1110;

public class pet {

	private String name;
	private int age;
	private boolean location;
	private String type;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getType() {
		return type;

	}
	
	public void setLocation(boolean location) {
		this.location = true;
	}
	
	public pet() {}
	
	};
	


