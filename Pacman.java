package pacmanproghazi;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pacman extends Thing {
	private Image pacman;
	private JPanel panel;
	public Pacman(int x, int y, JPanel p) {
		super(x, y);
		this.panel = p;
		
	}

	public void paint(Graphics g) {
		pacman = new ImageIcon("images/pacman.png").getImage();
		
		g.drawImage(pacman, x, y, 30, 30, panel);
	}
}
