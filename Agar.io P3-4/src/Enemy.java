import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy {
	//instance
	private double mass;
	private int w1,w2;
	private int  x, y;
	private int speed;
	private int speedX, speedY;
	private Color color;
	private int r;
	private int radius;
	
	//initial values
	public Enemy() {
		//x=200;
		//y=200;
		x= (int)(Math.random()*800);
		//x1= (int)(Math.random()*200);
		
		y=(int)(Math.random()*600); 
		//y1=(int)(Math.random()*200);
		w1= (int)( Math.random()*(80-20+1)+20);
		speedY= (int)(Math.random()*(3)+1);
		speedX= (int)(Math.random()*(3)+1);
		speedX=(int)(Math.random()*(2)-3);
		speedY= (int)(Math.random()*(2)-3);
		
		speedX= 80/w1;
		speedY= 80/w1;
		
		if(Math.random()>0.5){ 
			speedX*=-1; 
		}
		if(Math.random()>0.5){ 
			speedY*=-1; 
		}
		
		
		
		
		 
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
	public int getW1() {
		return w1/2; //getter for the radius
	}
	public void setW1(int W2) {
		w1=W2;//setter for the width
	} 
	public void setX(int paramX) {
		x=paramX; //setter for the X coordinate
	}
	public void setSpeed(int speed2) {
		speedX=speed2; 
		speedY=speed2;
	} 
	  
	//private int random(int width2) {
		// TODO Auto-generated method stub
		//return 0;
		//if(( Math.sqrt((y2 - y) * (y2 - y) + (x2 - x) * (x2 - x));)
	//}

	public boolean collided(Enemy en2) {
		
		//obj1(the object you are asking)
		//go from the corner of the oval to the center
		int x1= this.x +this.w1/2;
		//which ever object this method is calling, is asking this object
		int y1= this.y +this.w1/2;
		//obj2 coordinate
		int x2= en2.x+en2.w1/2;
		int y2= en2.x +en2.w1/2;
		double d= Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));//Math.pow(base, expo)
		if(d<w1/2+w2/2) {
			return true;
		}
		    return false;
	}//find the area, then 
	
	
	
	public void paint(Graphics g) {
		
		update(); //call method that helps with updating vars
		
		
		//call fillOval here
		g.setColor(color);
		g.fillOval(x,  y,  w1,  w1);
   
	}
		
		
	/* anything that updates the variables of this object */
	public void update() {
		//update x and y based on SpeedX and speedY
		x+=speedX;
		y+= speedY;
	}
	public double getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
