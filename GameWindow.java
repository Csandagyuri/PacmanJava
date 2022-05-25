package pacmanproghazi;


import javax.swing.JFrame;

public class GameWindow extends JFrame{
	
	
	/*	
	 * Az ablak alap beállításai
	 */
	public GameWindow() {
		this.setTitle("Pacman");
		this.setResizable(false);
		this.setSize(1000, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(new GamePlace() );
		this.setVisible(true);
	}

}
