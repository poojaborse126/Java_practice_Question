package bank;

public class VehicleRentalDemo {

	public static void main(String[] args) {
		Car car = new Car("Hyundai");
		Bike bike = new Bike("Honda");

		System.out.println(car.calculateRent(3));
		System.out.println(bike.calculateRent(3));
	}
}
