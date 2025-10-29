
public class Account{

	private Integer accNo;
	private String name;
	private String address;
	private Float balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Integer accNo, String name, String address, Float balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.address = address;
		this.balance = balance;
	}

	public Integer getAccNo() {
		return accNo;
	}

	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
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

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", address=" + address + ", balance=" + balance
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
