package _06_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JButton buttonAdd = new JButton("Add");
	JButton buttonMultiply = new JButton("Multiply");
	JButton buttonSubtract = new JButton("Subtract");
	JButton buttonDivide = new JButton("Divide");
	JPanel panel = new JPanel();
	JTextField text = new JTextField(20); 
	JTextField textTwo = new JTextField(20); 

	public void run() {
		frame.setTitle("Calculator");

		panel.add(buttonAdd);
		buttonAdd.addActionListener(this);
		panel.add(buttonMultiply);
		buttonMultiply.addActionListener(this);
		panel.add(buttonSubtract);
		buttonSubtract.addActionListener(this);
		panel.add(buttonDivide);
		buttonDivide.addActionListener(this);

		panel.setPreferredSize(new Dimension(400, 200)); 
		panel.setLayout(null);
		text.setBounds(12, 5, 180, 30);
		textTwo.setBounds(197, 5, 180, 30);
		
		buttonAdd.setBounds(0, 40, 100, 30);
		buttonSubtract.setBounds(90, 40, 100, 30);
		buttonMultiply.setBounds(190, 40, 100, 30);
		buttonDivide.setBounds(290, 40, 100, 30);
		
		panel.add(text);
		panel.add(textTwo); 
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonAdd) {
			
		}
		if (e.getSource() == buttonAdd) {

		}
		if (e.getSource() == buttonAdd) {

		}
		if (e.getSource() == buttonAdd) {

		}

	}
}
