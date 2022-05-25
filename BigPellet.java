package pacmanproghazi;

import java.awt.Color;
import java.awt.Graphics;

public class BigPellet extends Pellet{

	public BigPellet(int x, int y) {
		super(x, y);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x-10, y-10, 20, 20);
	}
}
