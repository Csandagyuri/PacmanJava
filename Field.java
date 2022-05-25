package pacmanproghazi;

import java.awt.Graphics;
import java.util.ArrayList;

public class Field {
	protected int x;
	protected int y;
	protected ArrayList<Field> neighbours;
	Graphics g;
	protected int fieldSize;
	protected ArrayList<Thing> things = new ArrayList<Thing>();
	
	public Field(int x, int y, int fieldSize) {
		this.x = x;
		this.y = y;
		this.fieldSize = fieldSize;
	}
	
	public void addNeighbours(Field f) {
		neighbours.add(f);
	}
	
	public void paint(Graphics g) {
	}
	
	public void addThing(Thing t) {
		things.add(t);
	}
	
	public void removeThing(Thing t) {
		things.remove(t);
	}
}
