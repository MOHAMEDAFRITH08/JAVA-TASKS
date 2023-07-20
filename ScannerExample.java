import java.util.Scanner;

class ScannerExample{
	public static void main(String args[]){

	System.out.println("Enter your first name : ");
	Scanner scn = new Scanner(System.in);
 	
	 
	String firstName = scn.nextLine();
	System.out.println("Enter your last name : ");
	char lastName = scn.next().charAt(0);
	System.out.println("your name :"+ firstName);
	System.out.println("your Initial :"+ lastName);
	
}

}