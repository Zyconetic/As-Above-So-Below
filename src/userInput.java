import java.util.*;

public class userInput {

	public static void main(String[] args) {
		int Input;
		int [] Numbers = {1, 3, 7, 4, 3};
		
		System.out.println(Arrays.toString(Numbers));
		
		System.out.print("Enter a number between 1 and 7: ");
		Scanner scan = new Scanner(System.in); 
		Input = scan.nextInt();
		
	switch (Input) {

	      case 1:
	    	System.out.println("above: 0");
			System.out.println("below: 4");
				break;
			
	      case 2:
		    	System.out.println("above: 1");
				System.out.println("below: 4");
				break;
				
	      case 3:
		    	System.out.println("above: 1");
				System.out.println("below: 2");
				break;
				
	      case 4:
		    	System.out.println("above: 4");
				System.out.println("below: 1");
				break;
				
	      case 5:
		    	System.out.println("above: 4");
				System.out.println("below: 1");
				break;
				
	      case 6:
		    	System.out.println("above: 4");
				System.out.println("below: 1");
				break;
				
	      case 7:
		    	System.out.println("above: 4");
				System.out.println("below: 0");
				break;
				
		default: 
			System.out.println("Invalid Number");
			break;
		
		}
		
		
	

	}
}