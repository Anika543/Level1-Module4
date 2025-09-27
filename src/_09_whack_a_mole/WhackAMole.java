package _09_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.util.Date;
import java.util.Random; 
public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel(); 
	Random rand = new Random(); 
	JButton mole; 
	int o = 0; 
	Date now = new Date(); 
	
	public void run() {
		frame.add(panel);
		frame.setTitle("Whack A Button For Fame And Glory");
	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int g = rand.nextInt(24); 
		drawButtons(g);
		frame.setSize(250, 340); 
		
	}
	
	public void drawButtons (int f) {
		
		panel.removeAll();;
		if(o==9) {
			endGame(now, o); 
		}
		for(int i = 0; i<24; i++) {
			JButton b = new JButton(); 
			b.addActionListener(this);
			panel.add(b);
			if(i == f) {
				b.setText("mole!");
				mole = b; 
				
			}
			
		}
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == mole) {
			
			drawButtons(rand.nextInt(24));
			o++; 
			
		}else {
			String s = "You clicked the Wrong Button"; 
			speak(s); 
			drawButtons(rand.nextInt(24));
		}
		
	}
	
	 static void speak(String words) {
	        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
	            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
	                    + words + "');\"";
	            try {
	                Runtime.getRuntime().exec( cmd ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        } else {
	            try {
	                Runtime.getRuntime().exec( "say " + words ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        }
	    }
	 
	 private void endGame(Date timeAtStart, int molesWhacked) { 
		    Date timeAtEnd = new Date();
		    JOptionPane.showMessageDialog(null, "Your whack rate is "
		            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
		                  + " moles per second.");
		}

}
