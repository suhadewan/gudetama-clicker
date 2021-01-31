import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

class LazyEggClicker {

	private JLabel counterLabel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton sticker1;
	private JLabel perSecLabel;
	private double eggCounter;
	private int timerSpeed;
	private int blanketNum;
	private int blanketPrice = 1;
	private int loveNum;
	private int lovePrice = 10;
	private int musicNum;
	private int musicPrice = 50;
	private int sleepNum;
	private int sleepPrice = 100;
	private int homeNum;
	private int homePrice = 150;
	private int lazyNum;
	private int lazyPrice = 200;
	private double perSec;
	private boolean timerOn;
	private Font font1;
	private Font font2;
	private EggHandler egghandled = new EggHandler();
	private Timer timer;
	private JLabel messageText;
	private MouseHandler mousehandled = new MouseHandler();
	private JLabel descriptionText;
	private JLabel descriptionText2;
	private JLabel descriptionText3;
	private JButton sticker2;
	private JButton sticker3;
	private JButton sticker4;
	private JButton sticker5;
	private JButton sticker6;
	private JButton sticker7;
	private JButton sticker8;
	private JButton sticker9;
	private JButton sticker10;
	private JButton sticker11;
	private JButton sticker12;
	

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
		messagePanel.setLayout(new GridLayout(4, 1));
		window.add(messagePanel);
		
		messageText = new JLabel();
		messageText.setBounds(365,170,335,104);
		messageText.setForeground(Color.white);
		messageText.setBackground(Color.orange);
		messageText.setFont(font2);
		messagePanel.add(messageText);
		
		descriptionText = new JLabel();
		descriptionText.setBounds(365,170,335,104);
		descriptionText.setForeground(Color.white);
		descriptionText.setBackground(Color.orange);
		descriptionText.setFont(font2);
		messagePanel.add(descriptionText);
		
		descriptionText2 = new JLabel();
		descriptionText2.setBounds(365,170,335,104);
		descriptionText2.setForeground(Color.white);
		descriptionText2.setBackground(Color.orange);
		descriptionText2.setFont(font2);
		messagePanel.add(descriptionText2);
		
		descriptionText3 = new JLabel();
		descriptionText3.setBounds(365,170,335,104);
		descriptionText3.setForeground(Color.white);
		descriptionText3.setBackground(Color.orange);
		descriptionText3.setFont(font2);
		messagePanel.add(descriptionText3);

		counterLabel = new JLabel(String.format("%.0f eggs", eggCounter));
		counterLabel.setForeground(Color.white);
		counterLabel.setFont(font1);
		counterPanel.add(counterLabel);

		perSecLabel = new JLabel();
		perSecLabel.setForeground(Color.white);
		perSecLabel.setFont(font2);
		counterPanel.add(perSecLabel);
		
		//stickers
		JPanel stickerPanel = new JPanel();
		stickerPanel.setBounds(740, 30, 670, 804);
		stickerPanel.setLayout(new GridLayout(6, 2));
		window.add(stickerPanel);
		
		ImageIcon lock = new ImageIcon(getClass().getClassLoader().getResource("pictures/lock.png"));
		sticker1 = new JButton();
		sticker1.setBackground(Color.white);
		sticker1.setFocusPainted(false);
		sticker1.setBorder(null);
		sticker1.setIcon(lock);
		sticker1.addActionListener(egghandled);
		sticker1.setActionCommand("s1");
		stickerPanel.add(sticker1);
		
		sticker2 = new JButton();
		sticker2.setBackground(Color.white);
		sticker2.setFocusPainted(false);
		sticker2.setBorder(null);
		sticker2.setIcon(lock);
		sticker2.addActionListener(egghandled);
		sticker2.setActionCommand("s2");
		stickerPanel.add(sticker2);
		
		sticker3 = new JButton();
		sticker3.setBackground(Color.white);
		sticker3.setFocusPainted(false);
		sticker3.setBorder(null);
		sticker3.setIcon(lock);
		sticker3.addActionListener(egghandled);
		sticker3.setActionCommand("s3");
		stickerPanel.add(sticker3);
		
		sticker4 = new JButton();
		sticker4.setBackground(Color.white);
		sticker4.setFocusPainted(false);
		sticker4.setBorder(null);
		sticker4.setIcon(lock);
		sticker4.addActionListener(egghandled);
		sticker4.setActionCommand("s4");
		stickerPanel.add(sticker4);
		
		sticker5 = new JButton();
		sticker5.setBackground(Color.white);
		sticker5.setFocusPainted(false);
		sticker5.setBorder(null);
		sticker5.setIcon(lock);
		sticker5.addActionListener(egghandled);
		sticker5.setActionCommand("s5");
		stickerPanel.add(sticker5);
		
		sticker6 = new JButton();
		sticker6.setBackground(Color.white);
		sticker6.setFocusPainted(false);
		sticker6.setBorder(null);
		sticker6.setIcon(lock);
		sticker6.addActionListener(egghandled);
		sticker6.setActionCommand("s6");
		stickerPanel.add(sticker6);
		
		sticker7 = new JButton();
		sticker7.setBackground(Color.white);
		sticker7.setFocusPainted(false);
		sticker7.setBorder(null);
		sticker7.setIcon(lock);
		sticker7.addActionListener(egghandled);
		sticker7.setActionCommand("s7");
		stickerPanel.add(sticker7);
		
		sticker8 = new JButton();
		sticker8.setBackground(Color.white);
		sticker8.setFocusPainted(false);
		sticker8.setBorder(null);
		sticker8.setIcon(lock);
		sticker8.addActionListener(egghandled);
		sticker8.setActionCommand("s8");
		stickerPanel.add(sticker8);
		
		sticker9 = new JButton();
		sticker9.setBackground(Color.white);
		sticker9.setFocusPainted(false);
		sticker9.setBorder(null);
		sticker9.setIcon(lock);
		sticker9.addActionListener(egghandled);
		sticker9.setActionCommand("s9");
		stickerPanel.add(sticker9);
		
		sticker10 = new JButton();
		sticker10.setBackground(Color.white);
		sticker10.setFocusPainted(false);
		sticker10.setBorder(null);
		sticker10.setIcon(lock);
		sticker10.addActionListener(egghandled);
		sticker10.setActionCommand("s10");
		stickerPanel.add(sticker10);
		
		sticker11 = new JButton();
		sticker11.setBackground(Color.white);
		sticker11.setFocusPainted(false);
		sticker11.setBorder(null);
		sticker11.setIcon(lock);
		sticker11.addActionListener(egghandled);
		sticker11.setActionCommand("s11");
		stickerPanel.add(sticker11);
		
		sticker12 = new JButton();
		sticker12.setBackground(Color.white);
		sticker12.setFocusPainted(false);
		sticker12.setBorder(null);
		sticker12.setIcon(lock);
		sticker12.addActionListener(egghandled);
		sticker12.setActionCommand("s12");
		stickerPanel.add(sticker12);
		
		//store

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
		button2.addMouseListener(mousehandled);
		itemPanel.add(button2);
		
		ImageIcon music = new ImageIcon(getClass().getClassLoader().getResource("pictures/music.png"));
		
		button3 = new JButton();
		button3.setBackground(Color.white);
		button3.setFocusPainted(false);
		button3.setBorder(null);
		button3.setIcon(music);
		button3.addActionListener(egghandled);
		button3.setActionCommand("music");
		button3.addMouseListener(mousehandled);
		itemPanel.add(button3);
		
		ImageIcon sleep = new ImageIcon(getClass().getClassLoader().getResource("pictures/sleep.png"));
		
		button4 = new JButton();
		button4.setBackground(Color.white);
		button4.setFocusPainted(false);
		button4.setBorder(null);
		button4.setIcon(sleep);
		button4.addActionListener(egghandled);
		button4.setActionCommand("sleep");
		button4.addMouseListener(mousehandled);
		itemPanel.add(button4);
		
		ImageIcon home = new ImageIcon(getClass().getClassLoader().getResource("pictures/home.png"));
		
		button5 = new JButton();
		button5.setBackground(Color.white);
		button5.setFocusPainted(false);
		button5.setBorder(null);
		button5.setIcon(home);
		button5.addActionListener(egghandled);
		button5.setActionCommand("home");
		button5.addMouseListener(mousehandled);
		itemPanel.add(button5);
		
		ImageIcon lazy = new ImageIcon(getClass().getClassLoader().getResource("pictures/lazy.png"));
		
		button6 = new JButton();
		button6.setBackground(Color.white);
		button6.setFocusPainted(false);
		button6.setBorder(null);
		button6.setIcon(lazy);
		button6.addActionListener(egghandled);
		button6.setActionCommand("lazy");
		button6.addMouseListener(mousehandled);
		itemPanel.add(button6);

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
			case "s1":
				if (eggCounter >= 10) {
					eggCounter -= 10;	
					ImageIcon s1 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker1.png"));
					sticker1.setIcon(s1);
				}
				break;
			case "s2":
				if (eggCounter >= 10) {
					eggCounter -= 10;	
					ImageIcon s2 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker2.png"));
					sticker2.setIcon(s2);
				}
				break;
			case "s3":
				if (eggCounter >= 10) {
					eggCounter -= 10;	
					ImageIcon s3 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker3.png"));
					sticker3.setIcon(s3);
				}
				break;
			case "s4":
				if (eggCounter >= 10) {
					eggCounter -= 10;	
					ImageIcon s4 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker4.png"));
					sticker4.setIcon(s4);
				}
				break;
			case "s5":
				if (eggCounter >= 10) {
					eggCounter -= 10;	
					ImageIcon s5 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker5.png"));
					sticker5.setIcon(s5);
				}
				break;
			case "s6":
				if (eggCounter >= 10) {
					eggCounter -= 10;	
					ImageIcon s6 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker6.png"));
					sticker6.setIcon(s6);
				}
				break;
			case "s7":
				if (eggCounter >= 10) {
					eggCounter -= 10;	
					ImageIcon s7 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker7.png"));
					sticker7.setIcon(s7);
				}
				break;
			case "s8":
				if (eggCounter >= 10) {
					eggCounter -= 10;	
					ImageIcon s8 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker8.png"));
					sticker8.setIcon(s8);
				}
				break;
			case "s9":
				if (eggCounter >= 10) {
					eggCounter -= 10;	
					ImageIcon s9 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker9.png"));
					sticker9.setIcon(s9);
				}
				break;
			case "s10":
				if (eggCounter >= 10) {
					eggCounter -= 10;	
					ImageIcon s10 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker10.png"));
					sticker10.setIcon(s10);
				}
				break;
			case "s11":
				if (eggCounter >= 10) {
					eggCounter -= 10;	
					ImageIcon s11 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker11.png"));
					sticker11.setIcon(s11);
				}
				break;
			case "s12":
				if (eggCounter >= 10) {
					eggCounter -= 10;	
					ImageIcon s12 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker12.png"));
					sticker12.setIcon(s12);
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
				messageText.setText("Blanket");
				descriptionText.setText("keep gudetama warm");
				descriptionText2.setText("increases by 0.1 eggs per sec");
				descriptionText3.setText("price: 1 egg");
			}
			else if (button == button2) {
				messageText.setText("Love");
				descriptionText.setText("give gudetama love");
				descriptionText2.setText("increases by 1 eggs per sec");
				descriptionText3.setText("price: 10 eggs");
			}
			else if (button == button3) {
				messageText.setText("Music");
				descriptionText.setText("gudetama loves groovy music");
				descriptionText2.setText("increases by 10 eggs per sec");
				descriptionText3.setText("price: 50 eggs");
			}
			else if (button == button4) {
				messageText.setText("Sleep");
				descriptionText.setText("gudetama's nap time");
				descriptionText2.setText("increases by 15 eggs per sec");
				descriptionText3.setText("price: 100 eggs");
			}
			else if (button == button5) {
				messageText.setText("Home");
				descriptionText.setText("gudetama's shell and gudetama are one");
				descriptionText2.setText("increases by 20 eggs per sec");
				descriptionText3.setText("price: 150 eggs");
			}
			else if (button == button6) {
				messageText.setText("Lazy");
				descriptionText.setText("gudetama the lazy egg");
				descriptionText2.setText("increases by 30 eggs per sec");
				descriptionText3.setText("price: 200 eggs");
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
		    messageText.setText(null);
		    descriptionText.setText(null);
		    descriptionText2.setText(null);
		    descriptionText3.setText(null);
			}
			
		
		
	}

}
