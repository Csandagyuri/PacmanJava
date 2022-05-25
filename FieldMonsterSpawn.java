package pacmanproghazi;

import java.awt.Color;
import java.awt.Graphics;

public class FieldMonsterSpawn extends Field{

	public FieldMonsterSpawn(int x, int y, int fieldSize) {
		super(x, y, fieldSize);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, fieldSize, fieldSize);
	}

}
