package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		String shape = in.next();
		System.out.println(shape);
		int r = in.nextInt();
		System.out.println(r);
		int g = in.nextInt();
		System.out.println(g);
		int b = in.nextInt();
		System.out.println(b);
		boolean boo = in.nextBoolean();
		System.out.println(boo);
		double x = in.nextDouble();
		System.out.println(x);
		double y = in.nextDouble();
		System.out.println(y);
		double doubleWidth = in.nextDouble();
		System.out.println(doubleWidth);
		double doubleHeight = in.nextDouble();
		System.out.println(doubleHeight);

		
		StdDraw.setPenColor(r, g, b);
		if(shape.equals("rectangle")) {
			if(boo==true) {
				StdDraw.filledRectangle(x, y, doubleWidth, doubleHeight);
			}
			else{
				StdDraw.rectangle(x, y, doubleWidth, doubleHeight);
			}
		}
		else if(shape.equals("ellipse")) {
			if(boo==true) {
				StdDraw.filledEllipse(x, y, doubleWidth, doubleHeight);
			}
			else {
				StdDraw.ellipse(x, y, doubleWidth, doubleHeight);
			}
		}
		else if(shape.equals("triangle")) {
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double[] xParameter = {x, doubleWidth, x3};
			double[] yParameter = {y, doubleHeight, y3};
			
			if(boo==true) {
				StdDraw.filledPolygon(xParameter, yParameter);
			}
			else {
				StdDraw.polygon(xParameter, yParameter);
			}
		}
	}
}
