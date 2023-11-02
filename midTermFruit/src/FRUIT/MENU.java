package FRUIT;
import java.util.Scanner;


public class MENU {
	private fruitList FruitList;
	
	public MENU() {
		this.FruitList = new fruitList();
	}
	public MENU(fruitList FruitList) {
		this.FruitList = FruitList;
	}
	
	public int choice() {
		System.out.println("+------------- Menu -------------------------------+");
		System.out.println("| 1. xem danh sách Trái Cây                        |");
		System.out.println("| 2. Thêm Trái Cây vào danh sách                   |");
		System.out.println("| 3. xem các trái cây có giá niêm yết cao hơn 20   |");
		System.out.println("| 4. Xoá Trái Cây                                  |");
		System.out.println("| 5. Tính tổng số Trái Cây có trong ds             |");
		System.out.println("| 6. Tìm Trái Cây bằng ID                          |");
		System.out.println("| 0. Thoát                                         |");
		System.out.println("+--------------------------------------------------+");
		System.out.print("Nhập lựa chọn của bạn: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public int choice(int subMenu) {
		switch (subMenu) {
			case 2:
				System.out.println("+-------- Thêm trái cây -------+");
				System.out.println("| 1. Thêm trái cây trong nước  |");
				System.out.println("| 2. Thêm trái cây xuất khẩu   |");
				System.out.println("+------------------------------+");
				break;
			case 4:
				System.out.println("+-------- Xóa Trái Cây ---------+");
				System.out.println("| 1. Trái Cây trong Nước        |");
				System.out.println("| 2. Trái Cây Xuất Khẩu         |");
				System.out.println("+-------------------------------+");
			
		
		}
		System.out.print("Nhập lựa chọn của bạn: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public void display() {
		if(FruitList.totalFruits() == 0)
		{
			System.out.println("danh sách hiện rỗng ");
			return;
		} else 
		{
			System.out.println("danh sách trái cây :\n");
			this.FruitList.displayFruitIN();
			this.FruitList.displayFruitOUT();
		}
		}
	public void addFruit(int choice) {
		fruit Fruit;
		if (choice == 1)
		{
			Fruit = new fruitIn();
			Fruit.input();
			FruitList.addFruitIn(Fruit);
			FruitList.displayFruitIN();
		}else
		{
			Fruit = new fruitOut();
			Fruit.input();
			FruitList.addFruitOut(Fruit);
			FruitList.displayFruitOUT();
		}
		display();
	}
	public void greaterthan20 ()
	{
		FruitList.greaterThan20();
	}
	public void removeFruit(int choice) {
		if ( choice == 1)
		{
			FruitList.removeFruitIn();
		}else
		{
			FruitList.removeFruitOut();
		}
	}
	public void totalPrice() {
		 FruitList.totalFruits();
	}
	public void searchFruit(int choice) {
		if(choice == 1) {
			FruitList.searchFruitIN();
		}else {
			FruitList.searchFruitOUT();
		}
	}
	public void run() {
		int choice, subChoice;
		Scanner sc = new Scanner(System.in);
		do {
			choice = choice();
			switch (choice) {
				case 1:
					display();
					break;
				case 2:
					subChoice = choice(choice);
					addFruit(subChoice);
					break;
				case 3:
					greaterthan20();
					break;
				case 4:
					subChoice = choice(choice);
					removeFruit(subChoice);
					break;
				case 5:
					System.out.println("Hiện có tổng số "+FruitList.totalFruits() + " Trái cây trong danh sách");
					break;
				case 6:
					subChoice = choice(choice);
					searchFruit(choice);
			}
		} while (choice != 0);
		System.out.println("Kết thúc");
	}
}
	

