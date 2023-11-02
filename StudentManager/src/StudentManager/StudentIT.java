package StudentManager;

import java.util.Scanner;

public class StudentIT extends Student {
	private float scoreCpp;
	private float scoreJava;
	
	public StudentIT()
	{
		super();
		this.scoreCpp = 0;
		this.scoreJava = 0;
	}
	public StudentIT(String masv, String name, int age, float scoreJava, float scoreCpp)
	{
		super(masv, name, age);
		this.scoreCpp = scoreCpp;
		this.scoreJava = scoreJava;
	}
	
	
	@Override
	public String toString() {
		return "StudentIT " + super.toString() +" scoreCpp=" + scoreCpp + ", scoreJava=" + scoreJava + "]";
	}
	public float getScoreCpp() {
		return scoreCpp;
	}
	public void setScoreCpp(float scoreCpp) {
		this.scoreCpp = scoreCpp;
	}
	public float getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(float scoreJava) {
		this.scoreJava = scoreJava;
	}
	@Override
	public float calculateAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("nhập điểm C++ : ");
		this.scoreCpp = sc.nextFloat();
		sc.nextLine();
		System.out.println("nhập điểm Java : ");
		this.scoreJava = sc.nextFloat();
		sc.nextLine();
	}
}
