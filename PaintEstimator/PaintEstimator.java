package PaintEstimator;
import java.util.Scanner;
import java.lang.Math;

public class PaintEstimator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double wallHeight;
		double wallWidth;
		double wallArea;
		final double paintGalNeed;
		int cansNeed;
		
		System.out.println("Enter wall height (feet):");
		wallHeight = scnr.nextDouble();
		
		System.out.println("Enter wall width (feet):");
		wallWidth = scnr.nextDouble();
		
		wallArea = wallWidth * wallHeight;
		System.out.println("Wall area: " + wallArea + " square feet");
		
		paintGalNeed = wallArea / 350;
		System.out.println("Paint needed: " + paintGalNeed + " gallons");
		
		cansNeed = (int) Math.ceil(paintGalNeed);
		System.out.println("Cans needed: " + cansNeed + " can(s)");

	}

}
