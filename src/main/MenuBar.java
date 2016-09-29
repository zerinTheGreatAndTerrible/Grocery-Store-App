package main;

//import main.Mainframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * @author Jacob Killpack
 *
 */
public class MenuBar extends JMenuBar implements ActionListener{
	
	JMenuBar menuBar;
	JMenu file, about, help;
	JMenuItem exit;
	JMenuItem details;
	JMenuItem instructions, bugReport;
	
	public MenuBar(){
		//Add headers to the Menubar
		file = new JMenu("File");
		this.add(file);
		about = new JMenu("About");
		this.add(about);
		help = new JMenu("Help");
		this.add(help);
		
		//Add the items to the file menu
		exit = new JMenuItem("Exit");
		exit.addActionListener(this);
		file.add(exit);
		
		//Add the items to the about menu
		details = new JMenuItem("About the Program");
		details.addActionListener(this);
		about.add(details);
		
		//Add the items to the help menu
		instructions = new JMenuItem("Instructions");
		instructions.addActionListener(this);
		help.add(instructions);
		
		bugReport = new JMenuItem("Report a Bug");
		bugReport.addActionListener(this);
		help.add(bugReport);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuBar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == exit) {
			System.exit(0);
		}
		if (e.getSource() == details) {
			JOptionPane.showMessageDialog(null, "This is the ScanableGrocery program.\n\nCreated"
					+ " September 27, 2016.\n1st released October 2,"
					+ " 2016.\n\nCreators: Jacob Killpack and Zerin Bates\n", "About", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		if (e.getSource() == instructions) {
			JOptionPane.showMessageDialog(null, "How To Use ScanableGrocery:\n1. Press 'Login"
					+ "\n2. Enter the Username and Password and click Submit. If you are unable to"
					+ " login, contact a Manager.\n3. Follow the next steps.", "Instructions", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		if (e.getSource() == bugReport) {
			JOptionPane.showMessageDialog(null, "To submit a bug report, please do the following:\n1."
					+ "Take a screen shot of the errors you are getting. \n2. Send an email with the "
					+ "screenshot attached to scanablegrocery@gmail.com \n3. "
					+ "Include in the email body a description of the error you are "
					+ "experiencing.", "Instructions", 
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
