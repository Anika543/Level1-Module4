package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker {
	JButton button = new JButton("Joke");
	JButton button2 = new JButton("Punchline"); 
	
	
	public void makeButtons() {
		JFrame frame = new JFrame(); 
		JPanel panel = new JPanel();
		frame.setLayout(new FlowLayout());
		 
		button.addActionListener(null);
		button2.addActionListener(new ActionListener());
		
		frame.setVisible(true);
		frame.add(panel);
		frame.add(button);
		frame.add(button2);
		
	
		//if(event.getSource() == button) {
			
		//}
		frame.pack();  
		
	
		
	}
	
	public static void main(String[] args) {
		
		ChuckleClicker click = new ChuckleClicker();
		click.makeButtons();
	
	}

}
