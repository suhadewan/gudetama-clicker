import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class LazyEggClicker{
	
	JLabel counterLabel;
	JLabel perSecLabel;
	int eggCounter;
	EggHandler handled = new EggHandler();
	
	public static void main(String[] args) {
		new LazyEggClicker();
	}
	
	public LazyEggClicker() {
		eggCounter = 0;
		createUI();
	}
	
	public void createFont() {
		
	}
	
	public void createUI() {
		JFrame window = new JFrame();
		window.setSize(800,800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(java.awt.Color.gray);
		window.setLayout(null);
		
		JPanel eggPanel = new JPanel();
		eggPanel.setBounds(200, 200, 200, 200);
		eggPanel.setBackground(Color.orange);
		window.add(eggPanel);
		
		//ImageIcon egg = new ImageIcon(getClass().getClassLoader().getResource(null));
		
		JButton eggButton = new JButton();
		eggButton.setBackground(Color.green);
		eggButton.setFocusPainted(false);
		eggButton.setBorder(null);
		eggPanel.add(eggButton);
		
		JPanel counterPanel = new JPanel();
		counterPanel.setBounds(200, 100, 200, 100);
		counterPanel.setBackground(Color.magenta);
		
		
		window.setVisible(true);
	}
	
	public class EggHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			eggCounter++;
		}
	}
}