package vien_Phi;

import java.util.Scanner;

public class Menu {
	private danhSachBenhNhan Menu;
	
	
	public Menu()
	{
		this.Menu = new danhSachBenhNhan();
	}
	public Menu(danhSachBenhNhan dsbn)
	{
		this.Menu = dsbn;
	}
	
	public int choice()
	{	
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("+--------------------------MENU-----------------------+");
			System.out.println("+ 1.Thêm Bệnh Nhân                                    +");
			System.out.println("+ 2.In ra danh sách bệnh nhân                         +");
			System.out.println("+ 3.bệnh nhân nội trú có viện phí >= 3000             +");
			System.out.println("+ 4.Tìm Bệnh Nhân                                     +");
			System.out.println("+-----------------------------------------------------+");
			System.out.println("\nNHẬP LỰA CHỌN CỦA BẠN: \n");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1)
			{
				System.out.println("1.Thêm bệnh nhân Ngoại Trú");
				System.out.println("2.Thêm bệnh nhân Nội Trú");
				System.out.println("\nNHẬP LỰA CHỌN CỦA BẠN: ");
				add();
			}
			if (choice == 2)
				displayAll();
			if (choice == 3)
				displayNoiTru();;
			if (choice == 4)
				searchBenhNhan();
			if ( choice == 0)
				System.out.println("KẾT THÚC CHƯƠNG TRÌNH !");
		} while (choice != 0);
		return choice;
	}
	public void searchBenhNhan()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập ID bệnh nhân cần tìm : ");
		String ID = sc.nextLine();
		Menu.searchBenhNhan(ID);
	}
	public void add()
	{
		Menu.addBenhNhan();
	}
	public void displayAll()
	{
		Menu.displayAll();
	}
	public void displayNoiTru()
	{
		Menu.displayNoiTru();
	}
	
	public void run()
	{
		 choice();
	}
}
