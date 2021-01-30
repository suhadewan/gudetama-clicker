import javax.swing.JFrame;

class LazyEggClicker{
	public static void main(String[] args) {
		new LazyEggClicker();
	}
	public LazyEggClicker() {
		createUI();
	}
	public void createUI() {
		JFrame window = new JFrame();
		window.setSize(800,800);
		
		window.setVisible(true);
	}
}