/*We consider the game to be a 2-D one. 
 * The players are spread across the map and can move by one step in any of the 4 possible directions at a time*/
import java.util.*;
public class Environment {


	public static void main(String args[]) {
		
		char grid[][]= new char[10][10];
		for(int i=0; i<grid.length; i++) {          
	        for(int j=0; j<grid.length; j++) {
	        	grid[i][j]='*'; 	
	        }
		}
		
	}
	
	class InputHandler{
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		int ct=s.nextInt();
	Player CT[] = new Player[ct];
	Player T[] = new Player[t];
	}
abstract class Player{
int index;
 String type;
int energy,speed,health;
 int x,y;

public int getIndex() {
	return index;
}
public void setIndex(int index) {
	this.index = index;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getEnergy() {
	return energy;
}
public void setEnergy(int energy) {
	this.energy = energy;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public void move(String dir)
{
	if(dir.equals("u"))
	{
		this.setY(this.getY()+1);
	}
	else if(dir.equals("d"))
	{
		this.setY(this.getY()-1);
	}
	else if(dir.equals("l"))
	{
		this.setX(this.getX()-1);
	}
	else if(dir.equals("r"))
	{
		this.setX(this.getX()+1);
	}
	
	
	
	
	
	
}
	

 Player site(Player P,Player Q) {
	if( P.getY()==Q.getY() ||  P.getX()==Q.getX() ) 
	{
		return Q;
	}
	 return P;
}
 void fire(Player P,Player Q)
{
	if(site(P, Q)==Q)
	{
		if(Q.getHealth()>0) {
		Q.setHealth(Q.getHealth()-1);
		}
	}
}
}
 class Aggressive extends Player{
      	Aggressive(int health,int speed)
      	{
      		super.setHealth(2);
      		super.setSpeed(10);
      	}
     
      void  move()
      	{
      		this.setEnergy(this.getEnergy()-2);
      	}
 }
 class Cautious extends Player{
	   	Cautious(int health,int speed)
      	{
      		super.setHealth(1);
      		super.setSpeed(2);
      	}
	    void  move()
      	{
      		this.setEnergy(this.getEnergy()-1);
      	}
      	 
 }
 class Blind extends Player{
	   	Blind(int health,int speed)
      	{
      		super.setHealth(3);
      		super.setSpeed(5);
      	}
	    void  move()
      	{
      		this.setEnergy(this.getEnergy()-3);
      	}
      	
 }
 abstract class Strategy{
	 
 }
 class Nearest extends Strategy{
	 
 }
 class Random extends Strategy{
	 
	 
 }
 class AheadOfMap extends Strategy{
	 
 }
 class GoToBomb extends Strategy{
	 
 }
 class Order{
	 Player a[] = new Player[100];
	 Player b[] = new Player[100];
 
 }
 class circular extends Order{

	 
	 
 }
 class bySuccess extends Order{
	 
	 
 }
 class byEnergy extends Order{
	 
 }
 }
 



