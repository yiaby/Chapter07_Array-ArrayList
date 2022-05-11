package alone;

public class StudentArray {

	public static void main(String[] args) {
		Student[] student = new Student[3];
		student[0] = new Student("Jonadan",1001);
		student[1] = new Student("Amey",1002);
		student[2] = new Student("Edward",1003);
		
		for(int i = 0; i < student.length; i++) {
			student[i].showInfo();
		}
	}

}
