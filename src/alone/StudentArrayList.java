package alone;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		
		student.add(new Student("Jonhsen",12001));
		student.add(new Student("Amanda",12002));
		student.add(new Student("Kate",12003));
		
		for(int i = 0; i < student.size(); i++) {
			Student stu = student.get(i);
			stu.showInfo();
		}
		System.out.println();
		
		System.out.println("===향상된 for문 사용===");
		for(Student stu : student) {
			stu.showInfo();
		}
	}

}
