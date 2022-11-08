package gui;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import gameLogic.Game;
import gameObjects.GameObject;

public class MainGamePanel extends JPanel{
	
	public static final int WIDTH = 896, HEIGHT = 640;
	public Game game;
	
	public MainGamePanel(Game game) {
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.game = game;

	}
	
	public void paintComponent( Graphics g) {
		super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
        
        game.getCurrScene().renderScene(g2);
		
//		for (GameObject obj : game.getGameObjects()) {
//			g2.setColor(obj.color);
//			g2.fillRect(obj.getRect().x, obj.getRect().y, obj.getRect().width, obj.getRect().height);
//		}
		
	}

}