package Student;

public class Car {
     String Brand;
     int Price;
     static String company="ABC Motors";
     Car(){
    	 System.out.println("The Brand of the Car:"+Brand);
     }
   
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.Brand="BMW";
		c1.Price=3000000;
		Car c2 = new Car();
		c2.Brand="Rolls Royce";
		c2.Price=4000000;
		Car c3 = new Car();
		c3.Brand="Jaguar";
		c3.Price=5000000;
		System.out.println("Car Brand: "+c1.Brand+" Car Price: "+c1.Price+" Company Name: "+company);
		System.out.println("Car Brand: "+c2.Brand+" Car Price: "+c2.Price+" Company Name: "+company);
		System.out.println("Car Brand: "+c3.Brand+" Car Price: "+c3.Price+" Company Name: "+company);

	}

}
