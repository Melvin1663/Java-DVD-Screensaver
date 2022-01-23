package cloud.apps.dvd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener {
	
	int x = 0;
	int y = 0;
	int xv = 1;
	int yv = 1;
	Timer timer;
	
	Panel() {
		timer = new Timer(1, this);
		timer.start();
		
		this.setPreferredSize(new Dimension(1280, 720));
		this.setBackground(Color.black);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		super.paint(g);
		
		g2D.drawImage(new ImageIcon(Main.class.getResource(Main.dvdlogo[Main.color])).getImage(), x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (x >= 1280-187 || x < 0) {
			xv = xv * -1;
			if (Main.color == 7) Main.color = 0;
			else Main.color++;
		}
		if (y >= 720-83 || y < 0) {
			yv = yv * -1;
			if (Main.color == 7) Main.color = 0;
			else Main.color++;
		}
		x += xv;
		y += yv;
		repaint();
	}
}
