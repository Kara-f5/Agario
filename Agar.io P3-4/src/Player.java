
import java.awt.Color;
import java.awt.Graphics;

public class Player {


	
	public int  x, y, vx, vy, radius=20;
	public Color c= new Color(255,0,255);
	
	public Player() {
		x= 800/2-radius;
		y= 600/2-radius;
	}
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(x, y,  radius*2,  radius*2);
	}
}
