package main;

import main.MenuBar;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;


/**
 * @author Jacob Killpack
 *
 */
public class Mainframe{
	
	private JFrame frame =  new JFrame("ScanableGrocery");
	private Container pane;
	MenuBar menu = new MenuBar();
	
	public Mainframe(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pane = frame.getContentPane();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		frame.setJMenuBar(menu);
		frame.pack();
		frame.setSize(1000, 600);
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
