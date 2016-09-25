/**
 * 
 */
package main;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 * @author Jacob Killpack
 *
 */
public class Mainframe {

	private JFrame frame =  new JFrame("ScanableGroceryMain");
	private Container pane;
	
	public Mainframe(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pane = frame.getContentPane();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		frame.pack();
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mainframe();
	}

}
