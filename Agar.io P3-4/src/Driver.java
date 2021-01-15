import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Driver extends JPanel implements MouseListener, ActionListener{
	
	//Create an array of enemies
	Enemy[] enemies= new Enemy[100];
	
	Cell[] cells= new Cell[20];
	public void paint(Graphics g) {
		for(int i=0; i< enemies.length-1;i++) {
		for(int j=i+1; j<enemies.length-1;i++) {
			if(enemies[i].collided(enemies[j])) {
			//smaller gets absorbed
					//teleport the small one out of the screen
					//enemies[i].getradius 
					double r= (double)enemies[i].getW1();//creating the variables for the radius
					double r1= (double)enemies[i].getW1();
					
					
					  
					
					double area1= r*r1*(Math.PI);//creating the variables for the area using the circle area formula
					double area2=r*r1*(Math.PI);
					double newArea= area1+area2;
					
				int W2=(int)(Math.sqrt(newArea/Math.PI));
				int speed2= 80/W2;
				if(r>r1) {
					enemies[i].(1000);
						enemies[j]= setW1(W2);
					enemies[j]= setSpeed(speed2);
					}else if(r1>r) {
						enemies[j]= setUI(1000);
						enemies[i]= setW1(W2); 
						enemies[i]= setSpeed(speed2);
					}
					
					//new area creates a double, then cast to int
					//get the radius with get width, check which one you have a bigger radius and move the small one out of the screen
				}
			}
		}
		
		super.paintComponent(g); //proper redrawing of the entire screen
		for(Enemy tempVar: enemies) {
			
		}
		//remove after checking that your program is runnable
		//g.fillRect(30, 30, 50, 50);
			//call the Enemy objects to paint themselves
		//for each - enhanced loop
		for(Enemy tempVar: enemies) {//for every enemy en in enemies invoke the paint method 
			tempVar.paint(g); 
		}
		 
	}
	
 
	//private Enemy setSpeed(int speed2) {
		// TODO Auto-generated method stub
	//	return null;
	//}


	//private Enemy setW1(int w2) {
		// TODO Auto-generated method stub
		//return null;
	//}


	//private Enemy setX(int i) {
		// TODO Auto-generated method stub
		//return null;
	//}
	
	  

	public Driver(){
		JFrame frame = new JFrame("Agar.io");
		frame.setSize(800,600);
		frame.add(this);
		
		/* add 100  Enemies */
		//visit each position in the enemies array
		for(int i=0; i< enemies.length; i++) {
			enemies[i]= new Enemy();
		}
		
		for(int i=0; i< cells.length; i++) {
		cells[i]= new Cell();
		}
	
		Timer t = new Timer(16, this); //chose swing library for import
		t.start();
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	
	public static void main(String[] arg) {
		Driver d = new Driver();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("here");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint(); //Timer will invoke this method which then refreshes the screen
				   // for the "animation"
	}
	
}
