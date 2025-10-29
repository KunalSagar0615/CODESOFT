import java.util.ArrayList;
import java.util.Scanner;

public class TestATM {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		var saving = new ArrayList<Account>();
		
		saving.add(10101,"kunal","Atpadi",50000);
		
		while(true) {
		System.out.println("""
				
		-----------------------Welcome to ATM-------------------------		
				1. Withdraw
				2. Deposit
				3. Check Balance
				4. Exit
				Enter your choice: 
				""");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter");
		}
		
		}
	}
}
