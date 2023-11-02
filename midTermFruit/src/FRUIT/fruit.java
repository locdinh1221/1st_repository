package FRUIT;

import java.util.Scanner;

public class fruit implements IFruit {
	private int ID;
	private String name;
	private double price;
	
	public fruit ()
	{
		this.ID = 0;
		this.name = "";
		this.price = 0.0;
	}
	public fruit (int ID, String Name, double price)
	{
		this.ID = ID;
		this.name = Name;
		this.price = price;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		price = price;
	}
	@Override
	public String toString() {
		return " [ID=" + ID + ", name=" + name + ", Price=" + price ;
	}
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập ID : ");
		this.ID = sc.nextInt();
		sc.nextLine();
		System.out.println("nhập Tên Loại Trái Cây : ");
		this.name = sc.nextLine();
		System.out.println("nhập Giá Niêm Yết : ");
		this.price = sc.nextDouble();
		sc.nextLine();
	}
	@Override
	public double priceForSale() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
