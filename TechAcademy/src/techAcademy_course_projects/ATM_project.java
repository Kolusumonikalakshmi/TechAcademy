package techAcademy_course_projects;
import java.util.Scanner;

public class ATM_project {
    private double balance;
    private Scanner scanner;
    
    public ATM_project() {
    	balance = 1000.00;
    	scanner = new Scanner(System.in);
    }
    
    void dispMenu() {
    	System.out.println("1.balance Enquiry");
    	System.out.println("2.deposit");
    	System.out.println("3.withdraw");
    	System.out.println("4.exist");
    	
    	
    }
    
    void withdraw() {
    	System.out.println(" withdraw amount :");
    	double amount = scanner.nextDouble();
    	if(amount<=balance && amount > 0) {
    		balance -= amount;
    		System.out.println("withdraw completed");
    	}else if( amount > balance) {
    		System.out.println("withdraw not posiible we have to deposit some amount");	
    	}
    }
    
    void deposit() {
    	System.out.println("deposit");
    	double amount =scanner.nextDouble();
    	if(amount>0) {
    		balance = balance + amount;
    		System.out.println("Amount deposited.");
    	}else {
    		System.out.println("invalid");
    	}
    	
    }
    
    void balanceEnquiry() {
    	System.out.println("balance :"+balance); // it will show balance.
    	
    }
    
    public static void main(String[] args) {
    	ATM_project atm = new ATM_project(); // create a object of class
    	while(true) { // it means when it executed
    		atm.dispMenu(); // first we have to display the menu options.
    		System.out.println(" choose your option");
    		int opt = atm.scanner.nextInt(); // taking input from user to interact with ATM.
    		
    		switch(opt) {
    		case 1 : atm.balanceEnquiry();
    		          break;
    		case 2 : atm.deposit();
    		          break;
    		case 3 : atm.withdraw();
    		          break;
    		case 4 : System.out.println("exit");
    		          break;
    	    default : System.out.println("Invalid choice");
    		}
    		
    	}
    	
    	
    }
	
	
}
