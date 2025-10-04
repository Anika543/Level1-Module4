package _10_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.*;

public class SlotMachine implements ActionListener {
	
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel();  
	String a = "cherry.jpeg"; 
	String b = "lime.jpeg"; 
	String c = "orange.jpeg"; 
	JLabelWithInt label = loadImageFromComputer(a, 0); 
	JLabelWithInt label2 = loadImageFromComputer(b, 1); 
	JLabelWithInt label3 = loadImageFromComputer(c, 2); 
	JButton button = new JButton(); 
	
	public void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.setText("spin");
		button.addActionListener(this);
		
		panel.setLayout(null);
		label.setBounds(0, 0, 300, 300);
		label2.setBounds(310, 0, 300, 300);
		label3.setBounds(620, 0, 300, 300);
		button.setBounds(420, 310, 60, 30);
		
		frame.add(panel);
		panel.add(label);
		panel.add(label2);
		panel.add(label3); 
		panel.add(button); 
		
		panel.setPreferredSize(new Dimension(1000, 400));
		frame.pack();
		frame.setVisible(true);
			
	}
	
	public JLabelWithInt loadImageFromComputer(String fileName, int n) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabelWithInt(icon, n);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		panel.remove(label);
		panel.remove(label2);
		panel.remove(label3);
		label = chooseRandomImage(); 
		label2 = chooseRandomImage(); 
		label3 = chooseRandomImage(); 
		
		label.setBounds(0, 0, 300, 300);
		label2.setBounds(310, 0, 300, 300);
		label3.setBounds(620, 0, 300, 300);
		panel.setPreferredSize(new Dimension(1000, 400));
		panel.add(label); 
		panel.add(label2);
		panel.add(label3);
		
		
		panel.repaint(); 
		if(label.n == label2.n && label.n==label3.n ) {
			JOptionPane.showMessageDialog(null, "You Won");
		}
		 
	}

	public JLabelWithInt chooseRandomImage() {
		Random r = new Random(); 
		int n = r.nextInt(3);
		
		if(n==0) {
			return loadImageFromComputer(a, n); 
		}else if(n==1) {
			return loadImageFromComputer(b, n);
		}else {
			return loadImageFromComputer(c, n); 
		}
		
	}
}


















