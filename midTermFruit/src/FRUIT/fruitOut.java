package FRUIT;

import java.util.Scanner;

public class fruitOut extends fruit {
	private double extraOut;
	
	public fruitOut ()
	{
		super();
		this.extraOut = 0;
	}

	public fruitOut(int ID, String Name, double price, double extraOut) {
		super(ID, Name, price);
		this.extraOut = extraOut;
	}

	public double getExtraOut() {
		return extraOut;
	}

	public void setExtraOut(double extraOut) {
		this.extraOut = extraOut;
	}

	@Override
	public String toString() {
		return "fruitOut" + super.toString()+ " extraOut=" + extraOut + "]";
	}
	public void addFruitOut()
	{
		Scanner sc = new Scanner(System.in);
		 fruitOut b = new fruitOut();
		 b.input();
	}
	public void input ()
	{
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập Phí Nhập Khẩu : ");
		this.extraOut = sc.nextDouble();
		sc.nextLine();
	}
	public double priceForSale ()
	{
		return super.getPrice() + this.extraOut;
	}
}
