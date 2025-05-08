/**
* Lab 10 Car Class
* Name: Sam Smith
*
*/

public class Car extends Vehicle {
	
	private int doors;
	private int passengers;
	
	/**
	*
	* @param aMake, the make of the car
	* @param aModel, the model of the car
	* @param aplate, the license plate of car
	* @param aDoors, the number of doors
	* @param aPassengers, number of passengers
	*
	*/
	
	public Car(String aMake, String aModel, String aPlate, int aDoors, int aPassengers){
		super(aMake, aModel, aPlate);
		this.doors = aDoors;
		this.passengers = aPassengers;
		

	}
	/**
	*
	* @return door, number of doors of car
	*/
	public int getDoors() {
		return this.doors;
	
	}
	/**
	*
	* @return passenger, number of passengres
	*
	*/
	public int getPassengers(){
		return this.passengers;	
	}
	
	/**
	*
	* toString method
	* @return result toString of information of the car
	*/
	@Override
	public String toString() {
		String result = String.format("%s -door %s%s with license %s.", this.doors, this.getMake(), this.getModel(), this.getPlate());
		return result;
	
	}
	/**
	*
	* equals method
	* @param Object obj, other car being compared to
	*/
	@Override
	
	public boolean equals(Object obj){
		if(!(obj instanceof Car)) {
			return false;
		}
			
		Car other = (Car) obj;
		if (this.passengers == other.getPassengers()){
				if (this.doors == other.getDoors()){
						return super.equals(obj);
		}
		
		}
	
		return false;
}

	/**
	* Copy Method
	* @return theCopy copy of the car
	*
	*/
	
	public Car copy() {
		String aMake = this.getMake();
		String aModel = this.getModel();
		String aPlate = this.getPlate();
		
		int aDoors = this.getDoors();
		int aPassengers = this.getPassengers();
		
		Car theCopy = new Car(aMake, aModel, aPlate, aDoors, aPassengers);
		return theCopy;
	
	}

}