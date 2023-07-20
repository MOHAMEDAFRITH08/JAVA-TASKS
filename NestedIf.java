import java.util.Scanner;

	class NestedIf {
	public static void main(String[] args){

	Scanner nest = new Scanner(System.in);
		
		System.out.println("Enter your Age :");
		int age = nest.nextInt();
		
	if(age >= 18){
		
		System.out.println("Enter you percentage");
		int per = nest.nextInt();
		if(per >=60){
		System.out.println("You are ok");
		}else{
		System.out.println("You are Not ok");
	        }
	}else{
		System.out.println("You are Not Eligible");
		}






}

}