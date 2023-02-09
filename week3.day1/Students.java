package assignments.week3.day1;

public class Students {
	
	public void getStudentInfo(int studID) {
		System.out.println("Student ID: "+studID);
	}
	public void getStudentInfo(int studID, String name) {
		System.out.println("Student ID: "+studID);
		System.out.println("Student Name: "+name);
	}
	public void getStudentInfo(String email, String phNum) {
		System.out.println("Email: "+email);
		System.out.println("Phone number: "+phNum);
	}
	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(5678);
		s.getStudentInfo(5678, "Lokesh");
		s.getStudentInfo("lokesh@test.com", "1234567");
	}

}
