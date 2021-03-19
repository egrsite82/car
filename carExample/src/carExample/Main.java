package carExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car ("Coche A");
		Car car2 = new Car ("Coche b");
		
		System.out.println(car1);
		
		car1.setMarca("BMW");
		car1.setModel("X6");
		car1.setColor("Black");
		car1.setTransmition("Manual");
		
		System.out.println("This car is a "+car1.getMarca());
		
	}

}
