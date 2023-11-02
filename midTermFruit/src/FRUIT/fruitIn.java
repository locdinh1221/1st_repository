package FRUIT;

import java.util.Scanner;

public class fruitIn extends fruit{
	private double extraIn;
	
	public fruitIn () 
	{
		super();
		this.extraIn = 0;
	}
	public fruitIn (int ID, String Name, double price, double extraIn)
	{
		super(ID, Name, price);
		this.extraIn = extraIn;
	}
	public double getExtraIn() {
		return extraIn;
	}
	public void setExtraIn(double extraIn) {
		this.extraIn = extraIn;
	}
	@Override
	public String toString() {
		return "[FruitIN : " + super.toString() + " extraIn=" + extraIn + "]";
	}
	public void addFruitIn () 
	{
		Scanner sc = new Scanner(System.in);
		 fruitIn a = new fruitIn();
		 a.input();
	}
	public void input ()
	{
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập Phí Nội Bộ  : ");
		this.extraIn = sc.nextDouble();
		sc.nextLine();
	}
	public double priceForSale ()
	{
		return super.getPrice() + this.extraIn;
	}
}
