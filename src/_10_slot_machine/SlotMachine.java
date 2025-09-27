package _10_slot_machine;

import javax.swing.*;

public class SlotMachine {
	
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel(); 
	JLabel label = new JLabel("cherry.jpeg");
	
	public void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(label); 
		
		frame.pack();
		frame.setVisible(true);
		
	}
	


}
