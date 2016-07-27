import java.util.Scanner;

public class numberValue {
	public static void main (String []arg){
	String choice = "y";
	while (choice.equalsIgnoreCase("y")){
		
	
	// get an int from the user
	Scanner scan = new Scanner(System.in);
	
	int numSquared = 0;
	int numCubed = 0;
	
	System.out.println("Learn your square and cube!");
	System.out.println("Enter an integer:");
	int num=Integer.parseInt(scan.nextLine());
	System.out.println();
	
	if (num>0){
	// define the table and append the header rows
	String table = "";
	table += "Number\t square\tcube\n";
	table += "======\t======\t=======\n";
	
	// appends the rest of the rows to the table
	for (int i = 1; i <= num; i++){
		int squares = i * i;
		int cubes = i*i*i;
		table  += 1 + "\t" + squares + "\t" + cubes + "\n";
	}
	System.out.println(table);
	System.out.println("Would you like to continue? (enter 'yes' or 'no')");
	Scanner scan1 = new Scanner (System.in);
	String Proceed = scan. nextLine();
	String String = "yes";
    System.out.println("Enter an integer");
    
    //if the user decides not to continue exit the for loop, close scanner.
    scan.close();
    System.out.println("Thanks for playing. Good bye!");
    
	
	

	
	
	
	
	}

	
		
	

	
	

		
	} 
}
}

