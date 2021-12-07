package activities;


class Car {

    String color;
	 String transmission;
	 int make;
	int tyres;
	int doors;
	
	public Car() {
		tyres=4;
		doors=4;
		
	}
	
	public void displayCharactristics() {
		System.out.println("color value is : "+color);
		System.out.println("transmission value is : "+transmission);
		System.out.println("make value is : "+make);
		System.out.println("tyres value is : "+tyres);
		System.out.println("doors value is : "+doors);
	}
	
	public void accilarate() {
		System.out.println("Car is moving forward...");
		
	}
	
	public void brack() {
		System.out.println("Car is stopped...");
		
	}
	
	
}

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.make=2014;
		car.color="Black";
		car.transmission="Manual";
        car.displayCharactristics();
        car.accilarate();
        car.brack();
	}

}
