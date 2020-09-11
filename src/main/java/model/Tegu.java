package model;

public class Tegu {
	private String name;
	private String color;
	private int age;
	private double price;
	private boolean isWildCaught;
	
	/**
	 * 
	 */
	public Tegu() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public Tegu(String name) {
		super();
		this.name = name;
	}

	/**
	 * @param color
	 * @param age
	 */
	public Tegu(String color, int age) {
		super();
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isWildCaught() {
		return isWildCaught;
	}

	public void setWildCaught(boolean isWildCaught) {
		this.isWildCaught = isWildCaught;
	}
}
