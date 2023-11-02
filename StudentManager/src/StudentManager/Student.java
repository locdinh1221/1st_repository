package StudentManager;
import java.util.Scanner;

public abstract class Student {
	private String masv;
	private String name;
	private int age;
	
	public Student()
	{
		this.age = 0;
		this.masv = "";
		this.name = "";
	}
	public Student(String masv, String name, int age)
	{
		this.age = age;
		this.masv = masv;
		this.name = name;
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "masv=" + masv + ", name=" + name + ", age=" + age ;
	}
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sv: ");
		this.masv = sc.nextLine();
		System.out.println("Nhập tên sv: ");
		this.name = sc.nextLine();
		System.out.println("nhập tuổi : ");
		this.age = sc.nextInt();
		sc.nextLine();
	}
	public abstract float calculateAverage();
}
