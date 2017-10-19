/*We consider the game to be a 2-D one. 
 * The players are spread across the map and can move by one step in any of the 4 possible directions at a time*/
import java.util.*;

public class Environment {


	public class InputHandler {
		Scanner s = new Scanner(System.in);
		 int t;
	int ct;
	InputHandler(int t,int ct){
	this.t= t;
	this.ct=ct;
	}
		Player CT[] = new Player[ct];
	    Player T[] = new Player[t];

		
	    void sortByIndex(Player P[],int n) {
	    	 for(int k=0;k<n;k++) {
	    	 for(int i=0;i<n;i++) {
	    		 if(P[k].getIndex()<P[i].getIndex()) {
	    			 int temp = P[k].getIndex();
	    			 P[k].setIndex(P[i].getIndex());
	    			 P[i].setIndex(temp);
	    			 
	    		 }
	    	 }
	    	 }
	    }
	 
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		char grid[][]= new char[10][10];
		for(int i=0; i<grid.length; i++) {          
	        for(int j=0; j<grid.length; j++) {
	        	grid[i][j]='*'; 	
	        }
		}
		
		
System.out.println(grid);
	}
	

	class Player{
int index;
 String type;
int energy,speed,health;
 int x,y;
int kills;
public int getKills() {
	return kills;
}
public void setKills(int kills) {
	this.kills = kills;
}
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
	if(site(P,Q)==Q)
	{
		if(Q.getHealth()>0) 
		{
		Q.setHealth(Q.getHealth()-1);
		}
	}
}

 class Order{
	 
	 InputHandler IH = new InputHandler(8,8);
	 Player a[] = new Player[100];
	 Player b[] = new Player[100];
    
 }
 class circular extends Order{
circular(Player P[])
{
	 for(int k=0;k<IH.t;k++) {
    	 for(int i=0;i<IH.ct;i++) {
    		 if(IH.T[k].getIndex()<IH.T[i].getIndex()) {
    			 int temp = IH.T[k].getIndex();
    			 IH.T[k].setIndex(IH.T[i].getIndex());
    			 IH.T[i].setIndex(temp);
    			 
    		 }
    	 }
    	 }
	 for(int k=0;k<IH.t;k++) {
    	 for(int i=0;i<IH.ct;i++) {
    		 if(IH.CT[k].getIndex()<IH.CT[i].getIndex()) {
    			 int temp = IH.CT[k].getIndex();
    			 IH.CT[k].setIndex(IH.CT[i].getIndex());
    			 IH.CT[i].setIndex(temp);
    			 
    		 }
    	 }
    	 }
	 Player IndexSort[] = new Player[IH.t+IH.ct];
	 int key=0;
	 for(int g=0;g<IH.t+IH.ct;g++)
	 {
	 if(key==0)
	 {
		 IndexSort[g]=IH.T[g];
	 key++;
	 }		 
			if(key==1)	 {
				IndexSort[g]=IH.CT[g];
			key--;
			}
		 
	 }
}

 }
 class bySuccess extends Order {
	 
	 bySuccess(Player P[])
	 {
		 for(int r1=0;r1<IH.ct;r1++) {
		 for(int r2=0;r2<IH.ct;r2++)
		 {
			 if(P[r1].getKills()<P[r2].getKills())
			 {
				 Player temp = P[r1];
				 P[r1]=P[r2];
				 P[r2]=temp;
			 }
		 }
		 }
	 }
	 
 }
 class byEnergy extends Order{
	 
	 byEnergy(Player P[])
	 {
		 for(int r1=0;r1<IH.ct;r1++) {
		 for(int r2=0;r2<IH.ct;r2++)
		 {
			 if(P[r1].getEnergy()<P[r2].getEnergy())
			 {
				 Player temp = P[r1];
				 P[r1]=P[r2];
				 P[r2]=temp;
			 }
		 }
		 }
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
  

class GameEngine {
Environment access = new Environment();
void play()
{
	
}
}

}






