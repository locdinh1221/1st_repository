package StudentManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager implements IManager {

	private  ArrayList<Student> studentss;
	
	public ArrayList<Student> getStudentss() {
		return studentss;
	}

	public void setStudentss(ArrayList<Student> studentss) {
		this.studentss = studentss;
	}

	@Override
	public void addStudent(Student student) {
		this.studentss.add(student);
		for(int i = 0; i < studentss.size();i++)
		{
			if(student.getMasv().equals(studentss.get(i).getMasv()))
			{
				System.out.println("thêm sv thất bại! Đã có sinh viên mang mã sv :" + student.getMasv());
				this.studentss.remove(student);
			}
		}
	}

	@Override
	public void editStudent(String masv, Student student) {
		for( int i = 0; i < studentss.size(); i++)
		{
			if(masv.equals(studentss.get(i).getMasv()))
			{
				studentss.get(i).input();
			}
		}
	}
	@Override
	public void removeStudent(String masv) {
		for(int i = 0;i<studentss.size();i++)
		{
			if(masv.equals(studentss.get(i).getMasv()))
			{
				System.out.println("đã xóa " + studentss.get(i).getMasv() + " khỏi danh sách sv");
				studentss.remove(i);
			}
		}
	}

	@Override
	public Student findStudent(String masv) {
		for (int i = 0; i < studentss.size(); i++) {
			Student student = studentss.get(i);
			String masvStudent = student.getMasv();
			if (masvStudent.equals(masv))
				return student;
		}
		return null;
	}
	public void sortByAge() {
	 Collections.sort(studentss,new Comparator<Student>()
			 {
				@Override
				public int compare(Student st1, Student st2) {
					// TODO Auto-generated method stub
					if(st1.getAge()<st2.getAge())
					{
						return -1;
					}
					if(st1.getAge()>st2.getAge())
					{
						return 1;
					}
					else 
					return 0;
				}
			 });
	}

	@Override
	public void sortByScore() {
		Collections.sort(studentss, new Comparator<Student>()
				{
					@Override
					public int compare(Student st1, Student st2) {
						// TODO Auto-generated method stub
						if(st1.calculateAverage()<st2.calculateAverage())
						{
							return -1;
						}
						if(st1.calculateAverage()>st2.calculateAverage())
						{
							return 1;
						}
						else
						return 0;
					}
				});
	}

	@Override
	public ArrayList<Student> findStudent(int age) {
		return null;
	}
	@Override
	public void displayAllStudent()  {
		if (studentss.size() == 0) {
			System.out.println("Danh sách rỗng");
			return;
		}

		System.out.println("Danh sách sinh viên");
		this.studentss.toArray().toString();
		}
}
