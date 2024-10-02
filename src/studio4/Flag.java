package studio4;

//import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		/*double r = in.nextDouble();
		double g = in.nextDouble();
		double b = in.nextDouble();
		boolean fill = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double hWidth = in.nextDouble();
		double hHeight = in.nextDouble();*/
		
		//gradients
		StdDraw.setPenColor(235, 193, 45);
		StdDraw.filledRectangle(0.5, 0.45, 0.5 , 0.05);
		StdDraw.setPenColor(219, 148, 42);
		StdDraw.filledRectangle(0.5, 0.55, 0.5 , 0.05);
		StdDraw.setPenColor(227, 74, 36);
		StdDraw.filledRectangle(0.5, 0.65, 0.5 , 0.05);
		StdDraw.setPenColor(237, 38, 71);
		StdDraw.filledRectangle(0.5, 0.75, 0.5 , 0.05);
		
		
		//sun
		StdDraw.setPenColor(237, 234, 40);
		StdDraw.filledCircle(0.5, 0.4, 0.1);
		//sea
		StdDraw.setPenColor(39, 104, 184);
		StdDraw.filledRectangle(0.5, 0.3, 0.5 , 0.1);
		
		//clouds
		StdDraw.setPenColor(250, 195, 247);
		StdDraw.filledCircle(0.1, 0.7, 0.05);
		StdDraw.filledCircle(0.125, 0.72, 0.05);
		StdDraw.filledCircle(0.15, 0.7, 0.05);
		StdDraw.filledCircle(0.3, 0.6, 0.05);
		StdDraw.filledCircle(0.325, 0.62, 0.05);
		StdDraw.filledCircle(0.35, 0.6, 0.05);
		StdDraw.filledCircle(0.8, 0.65, 0.05);
		StdDraw.filledCircle(0.825, 0.67, 0.05);
		StdDraw.filledCircle(0.85, 0.65, 0.05);
		
		//trap
		StdDraw.setPenColor(251, 252, 197);
		double [] x = {0.3, 0.4, 0.6, 0.7};
		double [] y = {0.2, 0.4, 0.4, 0.2};
		
		StdDraw.filledPolygon(x,y);
		
		


	}
}