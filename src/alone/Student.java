package alone;

public class Student {
	int studentID;
	String studentName;
	
	public Student() {}
	public Student(String name, int ID) {
		studentName = name;
		studentID = ID;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void showInfo() {
		System.out.println(studentName+" "+studentID);
	}
}
