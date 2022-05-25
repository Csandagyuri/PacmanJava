package pacmanproghazi;

import java.awt.Graphics;

public abstract class Thing {
	protected int x;
	protected int y;
	
	public Thing(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void paint(Graphics g){
	}
}
