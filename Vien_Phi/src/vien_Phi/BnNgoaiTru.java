package vien_Phi;

import java.util.Scanner;

public class BnNgoaiTru extends benhNhan {

	private double examinatinoFee;
	private double treatmentFee;
	
	public BnNgoaiTru()
	{
		super();
		this.examinatinoFee = 0;
		this.treatmentFee = 0;
	}
	public BnNgoaiTru(String ID, String name, double fee, double examinationFee, double treatmentFee)
	{
		super(ID, name, treatmentFee);
		this.examinatinoFee = examinationFee;
		this.treatmentFee = treatmentFee;
	}
	public double getExaminatinoFee() {
		return examinatinoFee;
	}
	public void setExaminatinoFee(double examinatinoFee) {
		this.examinatinoFee = examinatinoFee;
	}
	public double getTreatmentFee() {
		return treatmentFee;
	}
	public void setTreatmentFee(double treatmentFee) {
		this.treatmentFee = treatmentFee;
	}
	@Override
	public String toString() {
		return "BnNgoaiTru [" +super.toString() + " examinatinoFee=" + examinatinoFee + ", treatmentFee=" + treatmentFee + "]";
	}
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Nhập phí khám : ");
		this.examinatinoFee = sc.nextDouble();
		System.out.println("Nhập phí điều trị : ");
		this.treatmentFee = sc.nextDouble();
	}
	public double vienPhi()
	{
		return examinatinoFee + getFee() + treatmentFee;
		
	}
}
