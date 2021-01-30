import java.awt.Color;
import java.awt.Font;
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
	Font font1;
	Font font2;
	EggHandler handled = new EggHandler();
	
	public static void main(String[] args) {
		new LazyEggClicker();
	}
	
	public LazyEggClicker() {
		eggCounter = 0;
		createFont();
		createUI();
	}
	
	public void createFont() {
		font1 = new Font("Comic Sans MS", Font.PLAIN, 32);
		font2 = new Font("Comic Sans MS", Font.PLAIN, 15);
		
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
		counterPanel.setLayout(new GridLayout(2,1));
		window.add(counterPanel);
		
		counterLabel = new JLabel(eggCounter + " eggs");
		counterLabel.setForeground(Color.white);
		counterLabel.setFont(font1);
		counterPanel.add(counterLabel);
	
		perSecLabel = new JLabel();
		perSecLabel.setForeground(Color.white);
		perSecLabel.setFont(font2);
		counterPanel.add(perSecLabel);
		
		window.setVisible(true);
	}
	
	public class EggHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			eggCounter++;
		}
	}
}