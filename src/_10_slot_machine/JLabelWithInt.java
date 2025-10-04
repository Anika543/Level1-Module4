package _10_slot_machine;

import javax.swing.Icon;
import javax.swing.JLabel;

public class JLabelWithInt extends JLabel{
	public JLabelWithInt(Icon icon, int n) {
		super(icon);
		this.n = n; 
	}

	int n; 
	
}
