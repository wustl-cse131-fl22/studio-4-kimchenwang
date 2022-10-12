package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.5, 1, 1);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.5, 0.25, 1, 0.25);
		StdDraw.setPenColor(150, 0, 200);
		StdDraw.filledRectangle(0.5, 0.5, 0.25, 0.12);
		double[] earx = {0.25,0.3,0.35};
		double[] eary = {0.6,0.7,0.6};
		StdDraw.filledPolygon(earx,eary);
		double[] earx1 = {0.65,0.7,0.75};
		double[] eary1 = {0.6,0.7,0.6};
		StdDraw.filledPolygon(earx1,eary1);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(0.4, 0.5, 0.07);
		StdDraw.filledCircle(0.6, 0.5, 0.07);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.4, 0.5, 0.03);
		StdDraw.filledCircle(0.6, 0.5, 0.03);
		StdDraw.filledRectangle(0.5, 0.4, .1, 0.005);
		StdDraw.filledRectangle(0.5, 0.43, .005, 0.03);
	}
}