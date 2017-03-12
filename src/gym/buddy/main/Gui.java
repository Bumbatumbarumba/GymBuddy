package gym.buddy.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/* Creates a gui for testing features and stuff
 * Currently it's ugly; in the future it will be ugly too
 * cuz JFrame. BUT I plan on developing this in android
 * studio so hopefully it won't be too bad then.
 */
public class Gui extends JFrame{
	// puts text onto the window
	private JLabel label;
	private JButton button;
	// makes a textbox to type into
	private JTextField textField;

	public Gui(int xDim, int yDim){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(xDim, yDim);
		setVisible(true);
		setTitle("Gym Buddy");
		//this is basically a "default layout", which is lame
		setLayout(new FlowLayout());
		
		//Creates a new label instance that is blank, then gets
		//added to the window
		label = new JLabel("");
		add(label);
		
		//the parameters can be a string that will be the default
		//text in the textbox, or we can put in a number to limit
		//the number of chars that will fit in our box
		textField = new JTextField(15);
		add(textField);
		//creates a new button instance with text on it, then
		//adds it to the window
		button = new JButton("This is a button");
		add(button);

		event e = new event();
		button.addActionListener(e);
	}// end of MyGUI constructor

	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// put whatever you want to happen here
			label.setText("success");
		}
	}// end of event class
}
