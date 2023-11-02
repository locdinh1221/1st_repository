package vien_Phi;

import java.util.Scanner;

public class benhNhan implements IBenhNhan{

	private String name;
	private String ID;
	private double fee;
	
	
	public benhNhan()
	{
		this.fee = 0;
		this.ID = "";
		this.name = "";
	}
	
	public benhNhan(String ID, String name, double fee)
	{
		this.fee = fee;
		this.ID = ID;
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public double getFee() {
		return fee;
	}



	public void setFee(double fee) {
		this.fee = fee;
	}

	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã bệnh nhân : ");
		this.ID = sc.nextLine();
		System.out.println("Nhập tên : ");
		this.name = sc.next();
		System.out.println("Nhập phí điều trị : ");
		this.fee = sc.nextDouble();
	}


	@Override
	public String toString() {
		return " name=" + name + ", ID=" + ID + ", fee=" + fee ;
	}



	@Override
	public double vienphi() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
