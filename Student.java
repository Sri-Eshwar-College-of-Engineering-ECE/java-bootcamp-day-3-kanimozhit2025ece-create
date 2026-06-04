package Student;

public class Student {
     String name="Kanimozhi";
     int rollno= 6066;
     public void displayName() {
    	 System.out.println("Student Name: "+name);
    	 
     }
     public void displayRollNo() {
    	 System.out.println("Roll No:"+rollno);
     }
     
     public static void main(String[] args) {
    	 Student student= new Student();
    	 student.displayName();
    	 student.displayRollNo();
		

	}

}
