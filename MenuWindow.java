package pacmanproghazi;

import java.awt.GridLayout;

import javax.swing.*;

public class MenuWindow extends JFrame{
	private JPanel panel = new JPanel();
	
	public MenuWindow() {
	/*	
	 * Az ablak alap beállításaqi
	 */
		this.setTitle("Menü");
		this.setResizable(false);
		this.setSize(200, 300);
		this.setVisible(true);
		this.add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		GridLayout mylayout = new GridLayout(3,1, 30, 40);
		panel.setLayout(mylayout);
	/*	
	 * Megtalálható gombok
	 */
		JButton newGame = new JButton ("New Game");
		JButton scoreboard = new JButton ("Scoreboard");
		JButton exit = new JButton ("Exit");
		
		panel.add(newGame);
		panel.add(scoreboard);
		panel.add(exit);
	}
	
}
