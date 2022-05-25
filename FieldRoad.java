package pacmanproghazi;

import java.awt.Graphics;

public class FieldRoad extends Field{

	public FieldRoad(int x, int y, int fieldSize, Thing t) {
		super(x, y, fieldSize);
		this.addThing(t);
	}
	
	public void paint(Graphics g) {
		for(Thing i : things) {
			i.paint(g);
		}
	}

}
