import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MainGamePanel extends JPanel{
	
	public static final int WIDTH = 512, HEIGHT = 512;
	public Game game;
	
	public MainGamePanel(Game game) {
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.game = game;

	}
	
	public void paintComponent( Graphics g) {
		super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
		
		for (GameObject obj : game.getGameObjects()) {
			 g2.fillRect(obj.getPosition().x, obj.getPosition().y, 20, 20);
		}
		
	}

}
