package StudentManager;

import java.util.ArrayList;

public interface IManager {
	public void addStudent(Student student);
	public void editStudent(String masv, Student student);
	public void removeStudent(String masv);
	public Student findStudent(String masv);
	public void sortByAge();
	public void sortByScore();
	public ArrayList<Student> findStudent(int age);
	public void displayAllStudent();
}
