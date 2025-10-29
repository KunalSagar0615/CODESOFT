import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentService {

	ArrayList<Integer> rollNoData=new ArrayList<Integer>();
	private static Integer start_roll=101; 
	Integer rollNo;
	String name;
	String address;
	String grade;
	
	Scanner sc = new Scanner(System.in);
	
	public Student add() {

		System.out.println("Enter student details : ");
		
		while(true) {
			System.out.println("Enter Name: ");
			name=sc.nextLine();
			if(name.matches("[a-zA-Z ]+"))
				break;
			else
				System.out.println("Name cannot contain other than Aplabets or spaces !!");
		}
		
		System.out.println("Address: ");
		address=sc.nextLine();
		
		while(true) {
			System.out.println("Enter grade: ");
			grade=sc.next();
			
			
			if(grade.trim().length()>1)
				System.out.println("Grade must be single character");
			else if(grade.matches("[a-zA-Z]"))
				break;
			else
				System.out.println("Grade must be in alphabets from A to Z");
		}
		
		if(rollNoData.size()>0) {
			Collections.sort(rollNoData);
			rollNo=rollNoData.get(rollNoData.size()-1);
			return new Student(rollNo, name, address, grade);
		}
		
		rollNo=start_roll++;
		return new Student(rollNo, name, address, grade);
	}
	
	
	public void display(ArrayList<Student> stud) {		
		for (Student x : stud) {
			System.out.println(x);
		}		
	}


	public Student search(ArrayList<Student> stud, Integer rno) {
		
		for (Student x : stud) {
			if(x.getRollNo()==rno.intValue())
				return x;
		}
		
		return null;
	}


	public void delete(ArrayList<Student> stud, Student result) {
		
		rollNoData.add(result.getRollNo());
		stud.remove(result);
		if(stud.size()==0) {
			start_roll=101;
			rollNoData.clear();
		}
		
	}

	
	
	
}
