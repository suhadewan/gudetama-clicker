import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

class LazyEggClicker {

	JLabel counterLabel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JLabel perSecLabel;
	double eggCounter;
	int timerSpeed;
	int blanketNum;
	int blanketPrice = 1;
	int loveNum;
	int lovePrice = 10;
	int musicNum;
	int musicPrice = 50;
	int sleepNum;
	int sleepPrice = 100;
	int homeNum;
	int homePrice = 150;
	int lazyNum;
	int lazyPrice = 200;
	double perSec;
	boolean timerOn;
	Font font1;
	Font font2;
	EggHandler egghandled = new EggHandler();
	Timer timer;
	JTextArea messageText;
	MouseHandler mousehandled = new MouseHandler();
	

	public static void main(String[] args) {
		new LazyEggClicker();
	}

	public LazyEggClicker() {
		timerOn = false;
		perSec = 0;
		eggCounter = 0;
		blanketNum = 0;
		loveNum = 0;
		musicNum = 0;
		sleepNum = 0;
		homeNum = 0;
		lazyNum = 0;
		createFont();
		createUI();
	}

	public void createFont() {
		font1 = new Font("Comic Sans MS", Font.PLAIN, 32);
		font2 = new Font("Comic Sans MS", Font.PLAIN, 15);

	}

	public void createUI() {
		JFrame window = new JFrame();
		window.setSize(1440, 1024);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.WHITE);
		window.setLayout(null);

		JPanel title = new JPanel();
		title.setBounds(30, 30, 669, 115);
		title.setBackground(null);
		window.add(title);

		JLabel titlePic = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("pictures/title.png")));
		title.add(titlePic);
		

		JPanel eggPanel = new JPanel();
		eggPanel.setBounds(30, 274, 670, 560);
		eggPanel.setBackground(Color.orange);
		window.add(eggPanel);

		ImageIcon egg = new ImageIcon(getClass().getClassLoader().getResource("pictures/eggbutton.png"));

		JButton eggButton = new JButton();
		eggButton.setBackground(Color.white);
		eggButton.setFocusPainted(false);
		eggButton.setBorder(null);

		eggButton.setIcon(egg);

		eggButton.addActionListener(egghandled);
		eggButton.setActionCommand("egg");
		eggPanel.add(eggButton);

		JPanel counterPanel = new JPanel();
		counterPanel.setBounds(30, 170, 335, 104);
		counterPanel.setBackground(Color.orange);
		counterPanel.setLayout(new GridLayout(2, 1));
		window.add(counterPanel);
		
		JPanel messagePanel = new JPanel();
		messagePanel.setBounds(365,170,335,104);
		messagePanel.setBackground(Color.orange);
		window.add(messagePanel);
		
		messageText = new JTextArea();
		messageText.setBounds(365,170,335,104);
		messageText.setForeground(Color.white);
		messageText.setBackground(Color.orange);
		messageText.setFont(font2);
		messagePanel.add(messageText);

		counterLabel = new JLabel(String.format("%.0f eggs", eggCounter));
		counterLabel.setForeground(Color.white);
		counterLabel.setFont(font1);
		counterPanel.add(counterLabel);

		perSecLabel = new JLabel();
		perSecLabel.setForeground(Color.white);
		perSecLabel.setFont(font2);
		counterPanel.add(perSecLabel);

		JPanel itemPanel = new JPanel();
		itemPanel.setBounds(30, 834, 1380, 135);
		itemPanel.setLayout(new GridLayout(1, 6));
		window.add(itemPanel);

		ImageIcon blanket = new ImageIcon(getClass().getClassLoader().getResource("pictures/blanket.png"));
		
		button1 = new JButton();
		button1.setBackground(Color.white);
		button1.setFocusPainted(false);
		button1.setBorder(null);
		button1.setIcon(blanket);
		button1.addActionListener(egghandled);
		button1.setActionCommand("blanket");
		button1.addMouseListener(mousehandled);
		itemPanel.add(button1);
		
		ImageIcon love = new ImageIcon(getClass().getClassLoader().getResource("pictures/love.png"));
		
		button2 = new JButton();
		button2.setBackground(Color.white);
		button2.setFocusPainted(false);
		button2.setBorder(null);
		button2.setIcon(love);
		button2.addActionListener(egghandled);
		button2.setActionCommand("love");
		itemPanel.add(button2);
		
		ImageIcon music = new ImageIcon(getClass().getClassLoader().getResource("pictures/music.png"));
		
		button3 = new JButton();
		button3.setBackground(Color.white);
		button3.setFocusPainted(false);
		button3.setBorder(null);
		button3.setIcon(music);
		button3.addActionListener(egghandled);
		button3.setActionCommand("music");
		itemPanel.add(button3);
		
		ImageIcon sleep = new ImageIcon(getClass().getClassLoader().getResource("pictures/sleep.png"));
		
		button4 = new JButton();
		button4.setBackground(Color.white);
		button4.setFocusPainted(false);
		button4.setBorder(null);
		button4.setIcon(sleep);
		button4.addActionListener(egghandled);
		button4.setActionCommand("sleep");
		itemPanel.add(button4);
		
		ImageIcon home = new ImageIcon(getClass().getClassLoader().getResource("pictures/home.png"));
		
		button5 = new JButton();
		button5.setBackground(Color.white);
		button5.setFocusPainted(false);
		button5.setBorder(null);
		button5.setIcon(home);
		button5.addActionListener(egghandled);
		button5.setActionCommand("home");
		itemPanel.add(button5);
		
		ImageIcon lazy = new ImageIcon(getClass().getClassLoader().getResource("pictures/lazy.png"));
		
		button6 = new JButton();
		button6.setBackground(Color.white);
		button6.setFocusPainted(false);
		button6.setBorder(null);
		button6.setIcon(lazy);
		button6.addActionListener(egghandled);
		button6.setActionCommand("lazy");
		itemPanel.add(button6);

//		JPanel messagePanel = new JPanel();
//		messagePanel.setBounds(500, 200, 250, 150);
//		messagePanel.setBackground(Color.black);
//		window.add(messagePanel);

//		messageText = new JTextArea();
//		messageText.setBounds(500, 200, 250, 150);
//		messageText.setForeground(Color.white);
//		messageText.setBackground(Color.black);
//		messageText.setFont(font2);
//		messageText.setLineWrap(true);
//		messageText.setWrapStyleWord(true);
//		messageText.setEditable(false);
//		messagePanel.add(messageText);

		window.setVisible(true);
	}

	public void setTimer() {
		timer = new Timer(timerSpeed, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent x) {

				eggCounter += perSec;
				counterLabel.setText(String.format("%.0f eggs", eggCounter));
			}
		});
	}

	public void timerUpdate() {
		if (timerOn == false) {
			timerOn = true;
		} else if (timerOn == true) {
			timer.stop();
		}
		timerSpeed = 1000;
		String str = String.format("%.1f", perSec);

		perSecLabel.setText("per second: " + str);

		setTimer();
		timer.start();
	}

	public class EggHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String action = e.getActionCommand();

			switch (action) {
			case "egg":
				eggCounter++;
				counterLabel.setText(String.format("%.0f eggs", eggCounter));
				break;
			case "blanket":
				if (eggCounter >= blanketPrice) {
					eggCounter -= blanketPrice;
					blanketPrice += 1;
					perSec += 0.1;
					blanketNum++;
					button1.setText(String.format("Blanket (%d)", blanketNum));
					timerUpdate();
				}
				break;
			case "love":
				if (eggCounter >= lovePrice) {
					eggCounter -= lovePrice;
					lovePrice += 5;
					perSec += 1;
					loveNum++;
					button2.setText(String.format("Love (%d)", loveNum));
					timerUpdate();
				}
				break;
			case "music":
				if (eggCounter >= musicPrice) {
					eggCounter -= musicPrice;
					musicPrice += 10;
					perSec += 10;
					musicNum++;
					button3.setText(String.format("Music (%d)", musicNum));
					timerUpdate();

				}
				break;
			case "sleep":
				if (eggCounter >= sleepPrice) {
					eggCounter -= sleepPrice;
					sleepPrice += 15;
					perSec += 15;
					sleepNum++;
					button4.setText(String.format("Sleep (%d)", sleepNum));
					timerUpdate();

				}
				break;
			case "home":
				if (eggCounter >= homePrice) {
					eggCounter -= homePrice;
					homePrice += 20;
					perSec += 20;
					homeNum++;
					button5.setText(String.format("Home (%d)", homeNum));
					timerUpdate();

				}
				break;
			case "lazy":
				if (eggCounter >= lazyPrice) {
					eggCounter -= lazyPrice;
					lazyPrice += 30;
					perSec += 30;
					lazyNum++;
					button6.setText(String.format("Lazy (%d)", lazyNum));
					timerUpdate();

				}
				break;
			}

		}
	}
	
	public class MouseHandler implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
			JButton button = (JButton)e.getSource();
			
			if (button == button1 ) {
				messageText.setText("blanket");
			}
			else if (button == button2) {
				messageText.setText("love");
			}
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
			JButton button = (JButton)e.getSource();
			
			if (button == button1 ) {
				messageText.setText(null);
			}
			
		}
		
	}

}
