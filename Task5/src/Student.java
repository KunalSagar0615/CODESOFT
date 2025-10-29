
public class Student {
	private Integer rollNo;
	private String name;
	private String address;
	private String grade;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer rollNo, String name, String address, String grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.grade = grade;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", grade=" + grade + "]";
	}

		
	
}
