package vien_Phi;

import java.util.ArrayList;
import java.util.Scanner;

public class danhSachBenhNhan {
	private ArrayList <benhNhan> DsBenhNhan;

	public ArrayList<benhNhan> getDsBenhNhan() {
		return DsBenhNhan;
	}

	public void setDsBenhNhan(ArrayList<benhNhan> dsBenhNhan) {
		DsBenhNhan = dsBenhNhan;
	}

	@Override
	public String toString() {
		return "danhSachBenhNhan [DsBenhNhan=" + DsBenhNhan + "]";
	}
	public danhSachBenhNhan()
	{
		this.DsBenhNhan = new ArrayList<>();
	}
	public void addBenhNhan()
	{
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		sc.nextLine();
		if (choice == 1)
		{
			benhNhan a = new BnNgoaiTru();
			a.input();
					for ( int i = 0; i<this.DsBenhNhan.size(); i++)
			{
				if(this.DsBenhNhan.get(i).getID().equals(a.getID()))
				{
					System.out.println("đã có bệnh nhân mang ID: " + a.getID());
					return;
				}
			} 
					this.DsBenhNhan.add(a);
					System.out.println(a);
		}
		else if (choice == 2)
		{
			benhNhan a = new BnNoiTru();
			a.input();
					for ( int i = 0; i<this.DsBenhNhan.size(); i++)
			{
				if(this.DsBenhNhan.get(i).getID().equals(a.getID()))
				{
					System.out.println("đã có bệnh nhân mang ID: " + a.getID());
					return;
				}
			} 
					this.DsBenhNhan.add(a);
					System.out.println(a);
		}
	}
	public void displayAll()
	{
		if(this.DsBenhNhan.size()==0)
		{
			System.out.println("danh sách hiện rỗng : ");
		}
			
		else 
		{
		for(int i = 0; i < this.DsBenhNhan.size(); i++)
			System.out.println(this.DsBenhNhan.get(i).toString());
		}
	}
	public void displayNoiTru()
	{
		int count = 0;
		for(int i = 0; i < this.DsBenhNhan.size(); i++)
		{
			benhNhan o = new BnNoiTru();
			if (this.DsBenhNhan.getClass().equals(o.getClass()))
			{
				if(this.DsBenhNhan.get(i).vienphi() >= 3000)
					System.out.println(this.DsBenhNhan.get(i).toString());
				i++;
			}
		}if ( count == 0)
		{
			System.out.println("không có bệnh nhân nào có viện phí trên 3000");
		}
	}
	public void searchBenhNhan(String id)
	{	int count = 0;
		for (int i = 0; i< this.DsBenhNhan.size(); i++)
		{
			if (this.DsBenhNhan.get(i).getID().equals(id))
			{
				System.out.println(this.DsBenhNhan.get(i).toString());
				count ++;
			}
		}
		if (count == 0)
			System.out.println("không có bệnh nhân nào mang ID : " + id);
	}
}
