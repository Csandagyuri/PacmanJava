package pacmanproghazi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlace extends JPanel implements KeyListener, ActionListener{
	private int score = 0;
	private int delay = 8;
	private boolean dying;
	
	private int boardWidth = 23;
	private int boardHeight = 13;
	private int fieldSize = 40;
	private ArrayList<Field> boardFields = new ArrayList<Field>();
	private int req_dx, req_dy;
	//1-wall
	//0-field
	//2-monster spawn point
	//3-big Pellet spawn
	//4-pacman spawn
	private int board[] = {
		1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,
		1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,
		1,	0,	1,	1,	1,	0,	1,	1,	1,	1,	0,	0,	0,	1,	1,	1,	1,	0,	1,	1,	1,	0,	1,
		1,	0,	3,	1,	0,	0,	0,	0,	0,	1,	2,	2,	2,	1,	0,	0,	0,	0,	0,	1,	3,	0,	1,
		1,	0,	0,	1,	0,	1,	1,	1,	0,	1,	1,	1,	1,	1,	0,	1,	1,	1,	0,	1,	0,	0,	1,
		1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,
		1,	0,	0,	1,	1,	0,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	0,	1,	1,	0,	0,	1,
		1,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	1,
		1,	0,	1,	1,	1,	0,	1,	1,	1,	0,	0,	1,	0,	0,	1,	1,	1,	0,	1,	1,	1,	0,	1,
		1,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	1,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	1,
		1,	0,	0,	1,	1,	1,	1,	1,	1,	1,	0,	0,	0,	1,	1,	1,	1,	1,	1,	1,	0,	0,	1,
		1,	3,	0,	0,	0,	0,	0,	0,	0,	0,	0,	4,	0,	0,	0,	0,	0,	0,	0,	0,	0,	3,	1,
		1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1
	};
	
	public GamePlace() {
		
	/*	
	 * A pálya elemei létrehozása a fenti board alapján.
	 */
		for(int i = 0; i < boardWidth; i++) {
			for (int j = 0; j < boardHeight; j++) {
				int x = i*fieldSize;
				int y = j*fieldSize;
				if (board[i+j*boardWidth] == 1) {
					boardFields.add( new FieldWall(x, y, fieldSize));
				}else if(board[i+j*boardWidth] == 2) {
					boardFields.add(new FieldMonsterSpawn(x, y, fieldSize));
				}else if(board[i+j*boardWidth] == 3){
					boardFields.add( new FieldRoad(x, y, fieldSize, new BigPellet(x+fieldSize/2, y+fieldSize/2) ));
				}else if(board[i+j*boardWidth] == 4) {
					boardFields.add( new FieldRoad(x, y, fieldSize, new Pacman(x+5, y+5, this) ));
				}else{
					boardFields.add( new FieldRoad(x, y, fieldSize, new Pellet(x+fieldSize/2, y+fieldSize/2) ));
				}
			}
		}
		
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		Timer time = new Timer(delay, this);
		time.start();
	}
	
	public void initGame() {
		
	}
	
	public void paint(Graphics g) {
		//background
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 600);
		
		// DrawMaze
		for (Field i : boardFields) {
			i.paint(g);
		}
		//drawScore(g)
		//?doAnimation();
		
		//playGame(g);
		
		//Pacman
		//g.drawImage(pacman, 400, 400, 100,100, this);
	}

	public void playGame(Graphics g) {
		if (dying) {
			//death();
		}else {
			//movePacman();
			//drawPacman(g);
			//moveGhosts(g);
			//checkMaze();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			req_dx = 1;
			req_dy = 0;
		}else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			req_dx = -1;
			req_dy = 0;
		}else if (e.getKeyCode() == KeyEvent.VK_UP) {
			req_dx = 0;
			req_dy = 1;
		}else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			req_dx = 0;
			req_dy = -1;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}

}