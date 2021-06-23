import java.util.Scanner;
//RestaurantServer by Naima Jackson
//This code evaluates customer satisfaction and output a tip and new total based on satisfaction
public class RestaurantServer {

	public static void main(String[] args) {
       System.out.println("This code is by Naima Jackson" + "\n");
		billAsk();
	}
	
		
		
		 public static void billAsk() {
				
			 System.out.print("How much was your total?" + ":");
			 Scanner in = new Scanner(System.in);
			 if(in.hasNextDouble())
			{
			double total = in.nextDouble();	
			System.out.print("Your total is:" + total);
			
			 System.out.println("\n " +"How was your meal?" + ":");
				Scanner scan = new Scanner(System.in);
				if(scan.hasNextInt()) {
				int rate = scan.nextInt();
				System.out.print("You rate your meal:" + rate);
				if(rate == 1){
					int tip;
					tip = 20;
					double tipTotal = 0.20 * total;
					double newTotal = total + (0.2 * total);
					System.out.println("\n " + "Glad to hear You were TOTALLY SATISFIED!!"+ " " + "\n" + "Your tip is: " + tip + "%" + "\n" + "Your new total is: " + newTotal + "\n" + "Your total tip was: " + tipTotal);
				}
					if(rate == 2) {
						int tipTwo;
					    tipTwo = 15;
					    double tipTotalTwo = 0.15 * total;
					    double newTotalTwo = total + (0.15 * total);
						System.out.println("\n " + "Glad to hear You were SATISFIED!!"+ " " + "\n" + "Your tip is: " + tipTwo + "%" + "\n" + "Your new total is: " + newTotalTwo + "\n" + "Your total tip was: " + tipTotalTwo );
					}
				
					if(rate == 3) {
						int tipThree;
					    tipThree = 10;
					    double tipTotalThree = 0.10 * total;
					    double newTotalThree =total + (0.1 * total);;
							System.out.println("\n " + "Sorry to hear You were DISSATISFIED!!" + " " + "\n" + "Your tip is: " + tipThree + "%" + "\n" + "Your new total is: " + newTotalThree + "\n" + "Your total tip was: " + tipTotalThree);
					}	

			in.close();
		 
}
		 }
		 
}
				
		 
}
