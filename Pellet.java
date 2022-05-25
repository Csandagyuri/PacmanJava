package pacmanproghazi;

import java.awt.Color;
import java.awt.Graphics;

public class Pellet extends Thing{
	
	public Pellet(int x, int y) {
		super(x, y);
	}

	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x-3, y-3, 6, 6);
	}
}
