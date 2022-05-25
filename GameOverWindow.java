package pacmanproghazi;

import java.awt.GridLayout;

import javax.swing.*;

public class GameOverWindow extends JFrame{
	private JPanel panel = new JPanel();
	
	public GameOverWindow() {	
	/*	
	 * Az ablak alap beállításaqi
	*/
		this.setTitle("Game Over");
		this.setResizable(false);
		this.setSize(400, 70);
		this.add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	/*	
	 * Megtalálható elemek
	*/
		JButton ok = new JButton("OK");
		JTextField textfield = new JTextField(20);
		JLabel label = new JLabel("Add your name:");
		
		panel.add(label);
		panel.add(textfield);
		panel.add(ok);
		
		this.setVisible(true);
	}
}
