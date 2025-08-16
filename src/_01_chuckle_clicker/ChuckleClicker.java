package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button = new JButton("Joke");
	JButton button2 = new JButton("Punchline");

	public void makeButtons() {
		JFrame frame = new JFrame();
		frame.setTitle("ChuckleClicker");
		JPanel panel = new JPanel();

		button.addActionListener(this);
		button2.addActionListener(this);

		frame.add(panel);
		panel.add(button);
		panel.add(button2);

		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		ChuckleClicker click = new ChuckleClicker();
		click.makeButtons();

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() == button) {
			JOptionPane.showMessageDialog(null, "What tree can fit in your hand?");
		}
		if (event.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "A palm tree");
		}

	}

}
