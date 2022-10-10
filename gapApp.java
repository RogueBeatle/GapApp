package gapApp;
import java.text.DecimalFormat;
import java.util.Scanner;
public class gapApp {



	

public static void main(String[]args) {

	
	//calculations using total gaps, missed gaps and RO's to work out if targets have been achieved.
	//inputs 3, outputs- total gaps, gaps missed,gap missed % scanning accuracy, RO's, RO %
final DecimalFormat df = new DecimalFormat("0.0");
	
	try (Scanner readme = new Scanner(System.in)) {
		int numberOfGaps, numberMissed, replenOp; 
		float  numberOfAll, scanAcc,scanMissAcc,roPercentage;
		{
		System.out.println("How many Gap's are there: ");
		numberOfGaps = readme.nextInt();
		
		System.out.println("How many Gap's were missed: ");
		numberMissed = readme.nextInt();
		
		System.out.println("How many RO's were there: ");
		replenOp = readme.nextInt();
		}
		//Targets set by business
		int roTarget = 10;
		int scanTarget = 85;
		int scanMissTarget = 20;
		
		//calculations for results
		{
		numberOfAll = numberOfGaps + numberMissed; // total gaps
		roPercentage = replenOp / numberOfAll * 100;
		scanMissAcc = numberMissed / numberOfAll * 100; //scanning accuracy result
		scanAcc = 100 - scanMissAcc;
		}
		
		//print out results	
		
		{

		System.out.println("Gaps: " + numberOfGaps);
		System.out.println("Missing gaps: " + numberMissed);
		System.out.println("Total Gaps: " + numberOfAll);
		System.out.println("Scanning accuracy: "+ df.format(scanAcc));
		
		if (scanAcc >= scanTarget ){
			System.out.println("You've hit scanning accuracy target..");
		}else if (scanAcc <= scanTarget) {
				System.out.println("You've not hit the scanning accuracy target");
			}
		System.out.println("Gaps missed accuracy: "+  df.format(scanMissAcc));
		
		if (scanMissAcc<=scanMissTarget ){
			System.out.println("You've hit the gaps missed scanning target..");
				}
		else if (scanMissAcc >= scanMissTarget) {
				System.out.println("You've not hit gaps missed target target");
		}
		
		System.out.println("Replenishment opportunity % "+ df.format(roPercentage));
		if (roPercentage <= roTarget ){
			System.out.println("You've hit replenishment target..");
		}else if (roPercentage >= roTarget) {
				System.out.println("You've not hit replenishment target");
			}
		}
		}
	}
}

			
		
		
	
 	
 	
 	
 	

 	

