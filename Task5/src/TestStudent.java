import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
	public static void main(String args[]) {
		ArrayList<Student> stud=new ArrayList<Student>();
		StudentService ss=new StudentService();
		
		Student result;
		Integer rollNo;
		String name;
		String address;
		String grade;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("""
					
					1. Add Student
					2. Display All Students
					3. Search Student By Roll Number
					4. Update Student Information
					5. Delete Student Data
					6. Exit
					""");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				stud.add(ss.add());
				break;
				
			case 2:
				ss.display(stud);
				break;
				
			case 3:
				System.out.println("Enter Roll No: ");
				rollNo=sc.nextInt();
				result=ss.search(stud,rollNo);
				if(result!=null) {
					System.out.println(result);
				}
				else
					System.out.println("Roll number not found!!");
				break;
				
			case 4:
				System.out.println("Enter Roll No: ");
				rollNo=sc.nextInt();
				result=ss.search(stud,rollNo);
				if(result!=null) {
					System.out.println("""
							1. Update Name
							2. Update Address
							3. update Grade
							Enter your choice: 
							""");
					ch=sc.nextInt();
					switch(ch) {
					case 1:
						System.out.println("Enter your name: ");
						name = sc.next();
						result.setName(name);
						break;
						
					case 2:
						System.out.println("Enter Address: ");
						address=sc.next();
						address=sc.nextLine();
						result.setAddress(address);
						break;
					
					case 3:
						System.out.println("Enter grade: ");
						grade=sc.next();
						result.setGrade(grade);
						break;
						
					default:
						System.out.println("Invalid choice !!");
					}
				}
				else
					System.out.println("Roll number not found!!");
				break;
				
			case 5:
				System.out.println("Enter roll no: ");
				rollNo=sc.nextInt();
				result=ss.search(stud, rollNo);
				if(result!=null) {
					ss.delete(stud,result);
				}
				else
					System.out.println("Roll number not found!!");
				break;
			case 6:
				System.exit(0);
				
			default:
				System.out.println("Invalid choice!!");
			}
		}
	}
}
