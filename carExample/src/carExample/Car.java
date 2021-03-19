package carExample;

public class Car {

	private String Marca;
	private String Model;
	private String Color;
	private String Transmition;
	
	
	public Car (String marca) {
		this.Marca = "Ford";
		this.Model = "Mustang";
		this.Color = "Red";
		this.Transmition = "Automatic";
		
		
	}

	
	

	@Override
	public String toString() {
		return "Car [Marca=" + Marca + ", Model=" + Model + ", Color=" + Color + ", Transmition=" + Transmition + "]";
	}




	/**
	 * @return the marca
	 */
	public String getMarca() {
		return Marca;
	}


	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.Marca = marca;
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		return Model;
	}


	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.Model = model;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return Color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.Color = color;
	}


	/**
	 * @return the transmition
	 */
	public String getTransmition() {
		return Transmition;
	}


	/**
	 * @param transmition the transmition to set
	 */
	public void setTransmition(String transmition) {
		this.Transmition = transmition;
	}
	
	
	public void yourcar () {
		
	if (this.Marca=="Ford") {
		
		System.out.println ("tu vehiculo es un "+ this.getMarca()+ " de color " + this.getColor());
	}
	else {
		System.out.println ("tu vehiculo es un "+ this.getMarca()+ " de color " + this.getColor());
	}
	}
	
	
}
