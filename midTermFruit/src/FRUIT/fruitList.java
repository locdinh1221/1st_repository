package FRUIT;

import java.util.ArrayList;
import java.util.Scanner;

public class fruitList  {
	private ArrayList<fruitIn> fruitListIN;
	private ArrayList<fruitOut> fruitListOUT;
	
	public fruitList ()
	{
		this.fruitListIN = new ArrayList<>();
		this.fruitListOUT = new ArrayList<>();
	}
	public void addFruitIn(fruit a)
	{
		this.fruitListIN.add((fruitIn) a);
		for(int i = 1; i < fruitListIN.size(); i++)
		{
			if(a.getID()== fruitListIN.get(i).getID())
			{
				System.out.println("đã có trái cây mang ID " + a.getID() + " từ trước __ thêm thất bại! ");
				fruitListIN.remove(a);
			}
			}
	
	}
	public void addFruitOut(fruit b) 
	{
		this.fruitListOUT.add((fruitOut) b);
	for(int i = 1; i < fruitListOUT.size(); i++)
	{
		if(b.getID()== fruitListOUT.get(i).getID())
		{
			System.out.println("đã có trái cây mang ID " + b.getID() + " từ trước __ thêm thất bại! ");
			fruitListOUT.remove(b);
		}
		}
}
	public void displayFruitIN () 
	{
		System.out.println( this.fruitListIN);
	}
	public void displayFruitOUT () 
	{
		System.out.println( this.fruitListOUT);
		}
	@Override
	public String toString() {
		return "fruitList [fruitListIN=" + fruitListIN + ", fruitListOUT=" + fruitListOUT + "]";
	}
	public void greaterThan20()
	{int count = 0;
		for ( int i = 1; i < fruitListIN.size(); i++)
		{ count ++;
			fruitIn a = fruitListIN.get(i);
			if(a.priceForSale()> 20) 
				System.out.println(a);
		}
		if(count == 0)
			System.out.println("không có trái cây có giá niêm yết lớn hơn 20.");
		for ( int i = 1; i < fruitListOUT.size(); i++)
		{
			fruitOut b = fruitListOUT.get(i);
			if(b.priceForSale()> 20) 
				System.out.println(b);
		}
	}
	public int totalFruits ()
	{
		return this.fruitListIN.size() + this.fruitListOUT.size();
	}
	public void removeFruitIn()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ID cần xóa : " );
		int ID = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < fruitListIN.size(); i++) {
			int a = fruitListIN.get(i).getID();
			fruitIn b = fruitListIN.get(i);
			if ( ID == b.getID()) {
				System.out.println("đã xóa " + fruitListIN.get(i).getName() + " khỏi danh sách");
				fruitListIN.remove(i);
			}
		}
	}
	public void removeFruitOut()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ID cần xóa : " );
		int ID = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < fruitListOUT.size(); i++) {
			int a = fruitListOUT.get(i).getID();
			fruitOut b = fruitListOUT.get(i);
			if ( ID == b.getID()) {
				System.out.println("đã xóa " + fruitListOUT.get(i).getName() + " khỏi danh sách");
				fruitListOUT.remove(i);
			}
		}
	}
	public void searchFruitIN () {
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		for (int i = 1; i< fruitListIN.size(); i++)
		{
			int a = fruitListIN.get(i).getID();
			if (ID == a) System.out.println(fruitListIN.get(a));
			else System.out.println("không tìm thấy trái cây có ID " + ID + "trong danh sách !");
		}
	}
	public void searchFruitOUT () {
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		for (int i = 1; i< fruitListOUT.size(); i++)
		{
			int a = fruitListOUT.get(i).getID();
			if (ID == a) System.out.println(fruitListOUT.get(a));
			else System.out.println("không tìm thấy trái cây có ID " + ID + "trong danh sách !");
		}
	}
}
