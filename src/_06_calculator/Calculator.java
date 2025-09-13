package _06_calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
	JTextArea area = new JTextArea(); 	
	
	String StringText = text.getText(); 
	String StringTextTwo = text.getText(); 
	int num1 = 0;
	int num2 = 0; 
	
	
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
		
		panel.add(area);
		frame.add(area); 

		panel.setPreferredSize(new Dimension(400, 200));
		panel.setLayout(null);
		text.setBounds(12, 5, 180, 30);
		textTwo.setBounds(197, 5, 180, 30);

		buttonAdd.setBounds(0, 40, 100, 30);
		buttonSubtract.setBounds(90, 40, 100, 30);
		buttonMultiply.setBounds(190, 40, 100, 30);
		buttonDivide.setBounds(290, 40, 100, 30);
		
		area.setBounds(100, 75, 200, 95);
		Font font = new Font("", 0, 80); 
		area.setFont(font);
		area.setOpaque(false);
		area.setBackground(newColor(0, 0, 0 , 0));

		panel.add(text);
		panel.add(textTwo);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}

	private Color newColor(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String StringText = text.getText(); 
		String StringTextTwo = textTwo.getText(); 
		int num1 = 0;
		int num2 = 0; 
		num1 = Integer.parseInt(StringText);
		num2 = Integer.parseInt(StringTextTwo);
		int sum = num1 + num2;
		int product = num1 * num2;
		int difference = num1-num2;
		int quotient = num1/num2; 
		
		if (e.getSource() == buttonAdd) {
			area.setText("" + sum);
			
		}
		if (e.getSource() == buttonMultiply) {
			area.setText("" + product);

		}
		if (e.getSource() == buttonSubtract) {
			area.setText("" + difference);

		}
		if (e.getSource() == buttonDivide) {
			area.setText("" + quotient);

		}

	}
}
