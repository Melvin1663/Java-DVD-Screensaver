package cloud.apps.dvd;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DVD extends JFrame {
	DVD() {
		JPanel panel = new Panel();
		
		this.setSize(1280, 720);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.setResizable(false);
		this.pack();
		this.setIconImage(new ImageIcon(Main.class.getResource("/assets/dvdlogo.png")).getImage());
		this.setVisible(true);
		this.setTitle("Bouncing DVD Screen");
	}
}
