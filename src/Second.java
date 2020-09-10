import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean hasHighIncome = false;
//		boolean hasGoodCredit = true;
//		boolean hasCriminalRecord = false;
//		
//		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//		System.out.println(isEligible);
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter Temperature: ");
//		int temp = scanner.nextInt();
//		
//		if(temp>30) 
//			System.out.println("It's hot! Drink water.");			
//		
//		else if(temp>=20 && temp<=30)
//			System.out.println("Pleasant weather");			
//		
//		else 
//			System.out.println("Weather is cold");
		
		
//		int income = 1_20_000;
//		boolean hasHighIncome = (income>1_20_000);
	
//  ------ Switch statements ------------
		
//		String role="admin";
//		switch (role) {
//			case "admin":
//				System.out.println("You're an admin");
//				break;
//			
//			case "moderator":
//				System.out.println("You're a moderator");
//				break;
//				
//			default: // works like an else block
//				System.out.println("You're a guest");
//				break;
//				
//		}
		//---------------------------------------
		
	
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter the number: ");
//		int num = scanner.nextInt();
//		
//		if (num%5==0 && num%3==0)
//			System.out.println("FizzBuzz");
//		else if(num%5==0 && num%3!=0)
//			System.out.println("Fizz");
//		else if(num%5!=0 && num%3==0)
//			System.out.println("Buzz");
//		else
//			System.out.println(num);
		
//		for(int i=0; i<5;i++)
//			System.out.println(i);
//		
//		int j = 0;
//		while(j<5) {
//			System.out.println(j);
//			j+=1;
//		}
		
//		String input="";
//		Scanner scanner = new Scanner(System.in);
//		while(!input.equalsIgnoreCase("quit")) {
//			System.out.println("Enter: ");
//			input = scanner.next(); // input = scanner.next().toLowerCase();
//			System.out.println(input);
//		}
	//	-----------------------------------------------------------		
//		String input="";
//		Scanner scanner = new Scanner(System.in);
//		do {
//			System.out.println("Enter: ");
//			input = scanner.next(); // input = scanner.next().toLowerCase();
//			System.out.println(input);
//		}
//		while(!input.equalsIgnoreCase("quit"));
//-----------------------------------------------------------
//		String input="";
//		Scanner scanner = new Scanner(System.in);
//		while(true) {
//			System.out.println("Enter: ");
//			input = scanner.next().toLowerCase(); // input = scanner.next().toLowerCase();
//			if(input.equals("quit")) {
//				System.out.println("Program ended");
//				break;
//			}
//			else if(input.equals("pass")){
//				continue;
//			}
//				
//			System.out.println(input);
//		}
//--------------------------------------------------------------------------		
		String[] fruits = {"Apple", "Mango", "Orange"};
		for(int i = 0; i<fruits.length;i++)
			System.out.println(fruits[i]);
		
		for(String j : fruits)
			System.out.println(j);
		System.out.println("changes made after cloning the project1st");
		System.out.println("GitX Changes");
		System.out.println("GitDemo_developBranch");
		System.out.println("GitX_developBranch");
 }
}
