package pacmanproghazi;

import java.awt.Color;
import java.awt.Graphics;

public class FieldWall extends Field{


	public FieldWall(int x, int y, int fieldSize) {
		super(x, y, fieldSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint( Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, fieldSize, fieldSize);
	}
	

}
