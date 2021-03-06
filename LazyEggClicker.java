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
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Gudeclicker game
 * 
 * @author heathervu
 * @author mariamsinger
 * @author suhad
 *
 */
class LazyEggClicker {

	// fields

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

	/**
	 * LazyEggClicker Constructor
	 */
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

	/**
	 * method to create font
	 */
	public void createFont() {
		font1 = new Font("Comic Sans MS", Font.PLAIN, 32);
		font2 = new Font("Comic Sans MS", Font.PLAIN, 15);

	}

	/**
	 * method to create the UI
	 */
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
		messagePanel.setBounds(365, 170, 335, 104);
		messagePanel.setBackground(Color.orange);
		messagePanel.setLayout(new GridLayout(4, 1));
		window.add(messagePanel);

		messageText = new JLabel();
		messageText.setBounds(365, 170, 335, 104);
		messageText.setForeground(Color.white);
		messageText.setBackground(Color.orange);
		messageText.setFont(font2);
		messagePanel.add(messageText);

		descriptionText = new JLabel();
		descriptionText.setBounds(365, 170, 335, 104);
		descriptionText.setForeground(Color.white);
		descriptionText.setBackground(Color.orange);
		descriptionText.setFont(font2);
		messagePanel.add(descriptionText);

		descriptionText2 = new JLabel();
		descriptionText2.setBounds(365, 170, 335, 104);
		descriptionText2.setForeground(Color.white);
		descriptionText2.setBackground(Color.orange);
		descriptionText2.setFont(font2);
		messagePanel.add(descriptionText2);

		descriptionText3 = new JLabel();
		descriptionText3.setBounds(365, 170, 335, 104);
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

		// stickers
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
		sticker1.addMouseListener(mousehandled);
		stickerPanel.add(sticker1);

		sticker2 = new JButton();
		sticker2.setBackground(Color.white);
		sticker2.setFocusPainted(false);
		sticker2.setBorder(null);
		sticker2.setIcon(lock);
		sticker2.addActionListener(egghandled);
		sticker2.setActionCommand("s2");
		sticker2.addMouseListener(mousehandled);
		stickerPanel.add(sticker2);

		sticker3 = new JButton();
		sticker3.setBackground(Color.white);
		sticker3.setFocusPainted(false);
		sticker3.setBorder(null);
		sticker3.setIcon(lock);
		sticker3.addActionListener(egghandled);
		sticker3.setActionCommand("s3");
		sticker3.addMouseListener(mousehandled);
		stickerPanel.add(sticker3);

		sticker4 = new JButton();
		sticker4.setBackground(Color.white);
		sticker4.setFocusPainted(false);
		sticker4.setBorder(null);
		sticker4.setIcon(lock);
		sticker4.addActionListener(egghandled);
		sticker4.setActionCommand("s4");
		sticker4.addMouseListener(mousehandled);
		stickerPanel.add(sticker4);

		sticker5 = new JButton();
		sticker5.setBackground(Color.white);
		sticker5.setFocusPainted(false);
		sticker5.setBorder(null);
		sticker5.setIcon(lock);
		sticker5.addActionListener(egghandled);
		sticker5.setActionCommand("s5");
		sticker5.addMouseListener(mousehandled);
		stickerPanel.add(sticker5);

		sticker6 = new JButton();
		sticker6.setBackground(Color.white);
		sticker6.setFocusPainted(false);
		sticker6.setBorder(null);
		sticker6.setIcon(lock);
		sticker6.addActionListener(egghandled);
		sticker6.setActionCommand("s6");
		sticker6.addMouseListener(mousehandled);
		stickerPanel.add(sticker6);

		sticker7 = new JButton();
		sticker7.setBackground(Color.white);
		sticker7.setFocusPainted(false);
		sticker7.setBorder(null);
		sticker7.setIcon(lock);
		sticker7.addActionListener(egghandled);
		sticker7.setActionCommand("s7");
		sticker7.addMouseListener(mousehandled);
		stickerPanel.add(sticker7);

		sticker8 = new JButton();
		sticker8.setBackground(Color.white);
		sticker8.setFocusPainted(false);
		sticker8.setBorder(null);
		sticker8.setIcon(lock);
		sticker8.addActionListener(egghandled);
		sticker8.setActionCommand("s8");
		sticker8.addMouseListener(mousehandled);
		stickerPanel.add(sticker8);

		sticker9 = new JButton();
		sticker9.setBackground(Color.white);
		sticker9.setFocusPainted(false);
		sticker9.setBorder(null);
		sticker9.setIcon(lock);
		sticker9.addActionListener(egghandled);
		sticker9.setActionCommand("s9");
		sticker9.addMouseListener(mousehandled);
		stickerPanel.add(sticker9);

		sticker10 = new JButton();
		sticker10.setBackground(Color.white);
		sticker10.setFocusPainted(false);
		sticker10.setBorder(null);
		sticker10.setIcon(lock);
		sticker10.addActionListener(egghandled);
		sticker10.setActionCommand("s10");
		sticker10.addMouseListener(mousehandled);
		stickerPanel.add(sticker10);

		sticker11 = new JButton();
		sticker11.setBackground(Color.white);
		sticker11.setFocusPainted(false);
		sticker11.setBorder(null);
		sticker11.setIcon(lock);
		sticker11.addActionListener(egghandled);
		sticker11.setActionCommand("s11");
		sticker11.addMouseListener(mousehandled);
		stickerPanel.add(sticker11);

		sticker12 = new JButton();
		sticker12.setBackground(Color.white);
		sticker12.setFocusPainted(false);
		sticker12.setBorder(null);
		sticker12.setIcon(lock);
		sticker12.addActionListener(egghandled);
		sticker12.setActionCommand("s12");
		sticker12.addMouseListener(mousehandled);
		stickerPanel.add(sticker12);

		// store

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

	/**
	 * method to set timer
	 */
	public void setTimer() {
		timer = new Timer(timerSpeed, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent x) {

				eggCounter += perSec;
				counterLabel.setText(String.format("%.0f eggs", eggCounter));
			}
		});
	}

	/**
	 * method that updates the timer
	 */
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

	/**
	 * 
	 * EggHandler class that implements all the actions of the buttons
	 *
	 */
	public class EggHandler implements ActionListener {

		/**
		 * method for when a button is clicked
		 */
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
				if (eggCounter >= 1000) {
					eggCounter -= 1000;
					ImageIcon s1 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker1.png"));
					sticker1.setIcon(s1);
				}
				break;
			case "s2":
				if (eggCounter >= 5000) {
					eggCounter -= 5000;
					ImageIcon s2 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker2.png"));
					sticker2.setIcon(s2);
				}
				break;
			case "s3":
				if (eggCounter >= 10000) {
					eggCounter -= 10000;
					ImageIcon s3 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker3.png"));
					sticker3.setIcon(s3);
				}
				break;
			case "s4":
				if (eggCounter >= 15000) {
					eggCounter -= 15000;
					ImageIcon s4 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker4.png"));
					sticker4.setIcon(s4);
				}
				break;
			case "s5":
				if (eggCounter >= 20000) {
					eggCounter -= 20000;
					ImageIcon s5 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker5.png"));
					sticker5.setIcon(s5);
				}
				break;
			case "s6":
				if (eggCounter >= 25000) {
					eggCounter -= 25000;
					ImageIcon s6 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker6.png"));
					sticker6.setIcon(s6);
				}
				break;
			case "s7":
				if (eggCounter >= 30000) {
					eggCounter -= 30000;
					ImageIcon s7 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker7.png"));
					sticker7.setIcon(s7);
				}
				break;
			case "s8":
				if (eggCounter >= 35000) {
					eggCounter -= 35000;
					ImageIcon s8 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker8.png"));
					sticker8.setIcon(s8);
				}
				break;
			case "s9":
				if (eggCounter >= 40000) {
					eggCounter -= 40000;
					ImageIcon s9 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker9.png"));
					sticker9.setIcon(s9);
				}
				break;
			case "s10":
				if (eggCounter >= 45000) {
					eggCounter -= 45000;
					ImageIcon s10 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker10.png"));
					sticker10.setIcon(s10);
				}
				break;
			case "s11":
				if (eggCounter >= 50000) {
					eggCounter -= 50000;
					ImageIcon s11 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker11.png"));
					sticker11.setIcon(s11);
				}
				break;
			case "s12":
				if (eggCounter >= 55000) {
					eggCounter -= 55000;
					ImageIcon s12 = new ImageIcon(getClass().getClassLoader().getResource("pictures/sticker12.png"));
					sticker12.setIcon(s12);
				}
				break;
			}

		}
	}

	/**
	 * 
	 * class MouseHandler to implement what happens when hovering your mouse over
	 * certain elements
	 *
	 */
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

		/**
		 * method that gives description of each button as you hover over it
		 */
		@Override
		public void mouseEntered(MouseEvent e) {

			JButton button = (JButton) e.getSource();

			if (button == button1) {
				messageText.setText("Blanket");
				descriptionText.setText("keep gudetama warm");
				descriptionText2.setText("increases by 0.1 eggs per sec");
				descriptionText3.setText(String.format("price: %d eggs", blanketPrice));
			} else if (button == button2) {
				messageText.setText("Love");
				descriptionText.setText("give gudetama love");
				descriptionText2.setText("increases by 1 eggs per sec");
				descriptionText3.setText(String.format("price: %d eggs", lovePrice));
			} else if (button == button3) {
				messageText.setText("Music");
				descriptionText.setText("gudetama loves groovy music");
				descriptionText2.setText("increases by 10 eggs per sec");
				descriptionText3.setText(String.format("price: %d eggs", musicPrice));
			} else if (button == button4) {
				messageText.setText("Sleep");
				descriptionText.setText("gudetama's nap time");
				descriptionText2.setText("increases by 15 eggs per sec");
				descriptionText3.setText(String.format("price: %d eggs", sleepPrice));
			} else if (button == button5) {
				messageText.setText("Home");
				descriptionText.setText("gudetama's shell and gudetama are one");
				descriptionText2.setText("increases by 20 eggs per sec");
				descriptionText3.setText(String.format("price: %d eggs", homePrice));
			} else if (button == button6) {
				messageText.setText("Lazy");
				descriptionText.setText("gudetama the lazy egg");
				descriptionText2.setText("increases by 30 eggs per sec");
				descriptionText3.setText(String.format("price: %d eggs", lazyPrice));
			} else if (button == sticker1) {
				descriptionText.setText("Sticker price: 1000 eggs");
			} else if (button == sticker2) {
				descriptionText.setText("Sticker price: 5000 eggs");
			} else if (button == sticker3) {
				descriptionText.setText("Sticker price: 10000 eggs");
			} else if (button == sticker4) {
				descriptionText.setText("Sticker price: 15000 eggs");
			} else if (button == sticker5) {
				descriptionText.setText("Sticker price: 20000 eggs");
			} else if (button == sticker6) {
				descriptionText.setText("Sticker price: 25000 eggs");
			} else if (button == sticker7) {
				descriptionText.setText("Sticker price: 30000 eggs");
			} else if (button == sticker8) {
				descriptionText.setText("Sticker price: 35000 eggs");
			} else if (button == sticker9) {
				descriptionText.setText("Sticker price: 40000 eggs");
			} else if (button == sticker10) {
				descriptionText.setText("Sticker price: 45000 eggs");
			} else if (button == sticker11) {
				descriptionText.setText("Sticker price: 50000 eggs");
			} else if (button == sticker12) {
				descriptionText.setText("Sticker price: 55000 eggs");
			}
		}

		/**
		 * description disappears as your mouse leaves the element
		 */
		@Override
		public void mouseExited(MouseEvent e) {
			messageText.setText(null);
			descriptionText.setText(null);
			descriptionText2.setText(null);
			descriptionText3.setText(null);
		}

	}

}
