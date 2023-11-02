package vien_Phi;

import java.util.Scanner;

public class BnNoiTru extends benhNhan {
	
	private double dayFee;
	private int days;
	public BnNoiTru(String ID, String name, double fee, double dayFee, int days) {
		super(ID, name, dayFee);
		this.dayFee = dayFee;
		this.days = days;
	}
	
	public BnNoiTru() {
		super();
		this.dayFee = 0;
		this.days = 0;
	}

	public double getDayFee() {
		return dayFee;
	}

	public void setDayFee(double dayFee) {
		this.dayFee = dayFee;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		if (days < 0)
		{
			this.days = 0;
		}
		else
		this.days = days;
	}

	@Override
	public String toString() {
		return "BnNoiTru [ " + super.toString() + " +dayFee=" + dayFee + ", days=" + days + "]";
	}
	
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("nhập phí hằng ngày : ");
		this.dayFee = sc.nextDouble();
		System.out.println("nhập số ngày : ");
		this.days = sc .nextInt();
		sc.nextLine();
	}
	@Override
	public double vienphi() {
		if (days < 10)
		{
			return getFee()*days + dayFee*days + 50;
		}
		else if(days >= 10)
			return getFee()*days + dayFee*days + 100;
		return vienphi() ;
}
}
