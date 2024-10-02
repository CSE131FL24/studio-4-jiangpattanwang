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
		//rectangle 0 0 0 false 0.5 0.5 0.2 0.2
		//triangle 36 255 36 true 0.1 0.1 0.5 0.9 0.9 0.1
		//ellipse 146 0 0 true 0.5 0.5 0.2 0.2
		String shape = in.next();
		double r = in.nextDouble();
		double g = in.nextDouble();
		double b = in.nextDouble();
		boolean fill = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double hWidth = in.nextDouble();
		double hHeight = in.nextDouble();
		if(shape == rectangle && fill == false) {
			StdDraw.rectangle(x, y, hWidth, hHeight);
		} else if(shape == rectangle && fill == true) {
			StdDraw.setPenColor(r, g, b);
			StdDrawfilled.rectangle(x, y, hWidth, hHeight);
		}else if(shape == triangle && fill == false){
			//

		}
		
	}
}
