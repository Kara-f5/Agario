import java.awt.Color;
import java.awt.Graphics;

public class Cell {
	//instance
	private double mass;
	private int w1,w2;
	private int  x, y;
	
	private Color color;
	private int r;
	private int radius;
	
	//initial values
	public Cell() {
		//x=200;
		//y=200;
		
		
		
		 
		Color myColor= new Color(30,50,40);
		int red= (int)(Math.random()*256);//make the enemies have red, green, or blue randomly
		int green= (int)(Math.random()*256);
		int blue= (int)(Math.random()*256);
		color= new Color(red, green, blue);
		//randomize the position of every Enemy object to be in the 800*600 frame(width*height)
		//randomize width[20 80]
		//randomize speed to between [-3 3] (non zero)
		//width=50;
	

	}
	
	
	private int random(int width2) {
		// TODO Auto-generated method stub
		return 0;
		//if(( Math.sqrt((y2 - y) * (y2 - y) + (x2 - x) * (x2 - x));)
	}

	
	//find the area, then 
	
	
	
	public void paint(Graphics g) {
		
		update(); //call method that helps with updating vars
		
		
		//call fillOval here
		g.setColor(color);
		g.fillOval(x,  y, 10 ,  10);
		
	}
		
		
	/* anything that updates the variables of this object */
	public void update() {
		//update x and y based on SpeedX and speedY
		
	}
	public double getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
