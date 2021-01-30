import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

class LazyEggClicker {

	JLabel counterLabel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JLabel perSecLabel;
	double eggCounter;
	int timerSpeed;
	int blanketNum;
	int blanketPrice = 1;
	int loveNum;
	int lovePrice=10;
	int musicNum;
	int musicPrice=50;
	int incubatorNum;
	int incubatorPrice = 100;
	int baconNum;
	int baconPrice;
	int farmNum;
	int farmPrice;
	double perSec;
	boolean timerOn;
	Font font1;
	Font font2;
	EggHandler handled = new EggHandler();
	Timer timer;
	JTextArea messageText;

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
		incubatorNum = 0;
		createFont();
		createUI();
	}

	public void createFont() {
		font1 = new Font("Comic Sans MS", Font.PLAIN, 32);
		font2 = new Font("Comic Sans MS", Font.PLAIN, 15);

	}

	public void createUI() {
		JFrame window = new JFrame();
		window.setSize(800, 800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(java.awt.Color.gray);
		window.setLayout(null);

		JPanel eggPanel = new JPanel();
		eggPanel.setBounds(200, 200, 200, 200);
		eggPanel.setBackground(Color.orange);
		window.add(eggPanel);

		ImageIcon egg = new ImageIcon(getClass().getClassLoader().getResource("pictures/eggbutton.png"));

		JButton eggButton = new JButton();
		eggButton.setBackground(Color.green);
		eggButton.setFocusPainted(false);
		eggButton.setBorder(null);

		eggButton.setIcon(egg);

		eggButton.addActionListener(handled);
		eggButton.setActionCommand("egg");
		eggPanel.add(eggButton);

		JPanel counterPanel = new JPanel();
		counterPanel.setBounds(200, 100, 200, 100);
		counterPanel.setBackground(Color.magenta);
		counterPanel.setLayout(new GridLayout(2, 1));
		window.add(counterPanel);

		counterLabel = new JLabel(String.format("%.0f eggs", eggCounter));
		counterLabel.setForeground(Color.white);
		counterLabel.setFont(font1);
		counterPanel.add(counterLabel);

		perSecLabel = new JLabel();
		perSecLabel.setForeground(Color.white);
		perSecLabel.setFont(font2);
		counterPanel.add(perSecLabel);

		JPanel itemPanel = new JPanel();
		itemPanel.setBounds(500, 170, 250, 250);
		itemPanel.setBackground(Color.blue);
		itemPanel.setLayout(new GridLayout(4, 1));
		window.add(itemPanel);

		button1 = new JButton("Blanket");
		button1.setFont(font1);
		button1.setFocusPainted(false);
		button1.addActionListener(handled);
		button1.setActionCommand("Blanket");
		itemPanel.add(button1);
		button2 = new JButton("Love");
		button2.setFont(font1);
		button2.setFocusPainted(false);
		button2.addActionListener(handled);
		button2.setActionCommand("Love");
		itemPanel.add(button2);
		button3 = new JButton("Music");
		button3.setFont(font1);
		button3.setFocusPainted(false);
		button3.addActionListener(handled);
		button3.setActionCommand("Music");
		itemPanel.add(button3);
		button4 = new JButton("Incubator");
		button4.setFont(font1);
		button4.setFocusPainted(false);
		button4.addActionListener(handled);
		button4.setActionCommand("Incubator");
		itemPanel.add(button4);

		JPanel messagePanel = new JPanel();
		messagePanel.setBounds(500, 70, 250, 150);
		messagePanel.setBackground(Color.black);
		window.add(messagePanel);

		messageText = new JTextArea();
		messageText.setBounds(500, 70, 250, 150);
		messageText.setForeground(Color.white);
		messageText.setBackground(Color.black);
		messageText.setFont(font2);
		messageText.setLineWrap(true);
		messageText.setWrapStyleWord(true);
		messageText.setEditable(false);
		messagePanel.add(messageText);

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
			case "Blanket":
				if (eggCounter >= blanketPrice) {
					eggCounter -= blanketPrice;
					blanketPrice += 1;
					perSec += 0.1;
					blanketNum++;
					button1.setText(String.format("Blanket (%d)", blanketNum));
					timerUpdate();
					break;
				}
			case "Love":
				if (eggCounter >= lovePrice) {
					eggCounter -= lovePrice;
					lovePrice += 5;
					perSec += 1;
					loveNum++;
					button2.setText(String.format("Love (%d)", loveNum));
					timerUpdate();
					break;
				}
			case "Music":
				if (eggCounter >= musicPrice) {
					eggCounter -= musicPrice;
					musicPrice += 10;
					perSec += 10;
					musicNum++;
					button3.setText(String.format("Music (%d)", musicNum));
					timerUpdate();
					break;
				}
			}

		}
	}

}
