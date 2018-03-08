import kareltherobot.*;

public class Driver implements Directions{
	static Robot robbie;
	static Robot robbie5;
	 
	
	public static void main(String[] args) {

		robbie5=new Robot(1,2,East,30);
		robbie = new Robot(1,1,East,30);
		World.setVisible(true);
		World.setDelay(50);
		 for(int x=0;x<4;x++)
			 robbie.move();  
			 robbie.putBeeper();
			 robbie.move();
			 robbie.putBeeper();
			 robbie.move();
			 robbie.putBeeper();
			 robbie.turnLeft();
			 robbie.move();  
			 robbie.putBeeper();
			 robbie.move();
			 robbie.putBeeper();
			 robbie.turnLeft();
			 robbie.move();  
			 robbie.putBeeper();
			 robbie.move();
			 robbie.putBeeper();
			 robbie.turnLeft();
			 robbie.move();
			 robbie.putBeeper();
			 robbie.move();
			 
			 
		
			 
			 
	}}
			
	
			 
		/*robbie.putBeeper();
		robbie.move();
		robbie.putBeeper();
		robbie.move();robbie.putBeeper();
		robbie.putBeeper();
		robbie.move();
		robbie.turnLeft();
		robbie.putBeeper();
		robbie.move();
		robbie.putBeeper();
		robbie.move();robbie.putBeeper();
		robbie.putBeeper();
		robbie.move();
		robbie.turnLeft();
		robbie.putBeeper();
		robbie.move();
		robbie.putBeeper();
		robbie.move();robbie.putBeeper();
		robbie.putBeeper();
		robbie.move();
		robbie.turnLeft();
		robbie.putBeeper();
		robbie.move();
		robbie.putBeeper();
		robbie.move();robbie.putBeeper();
		robbie.putBeeper();
		robbie.move();
		robbie.turnLeft();
		
		robbie5.putBeeper();
		robbie5.move();
		robbie5.putBeeper();
		robbie5.move();robbie5.putBeeper();
		robbie5.putBeeper();
		robbie5.move();
		robbie5.turnLeft();
		robbie5.putBeeper();
		robbie5.move();
		robbie5.putBeeper();
		robbie5.move();robbie5.putBeeper();
		robbie5.putBeeper();
		robbie5.move();
		robbie5.turnLeft();
		robbie5.putBeeper();
		robbie5.move();
		robbie5.putBeeper();
		robbie5.move();robbie5.putBeeper();
		robbie5.putBeeper();
		robbie5.move();
		robbie5.turnLeft();
		robbie5.putBeeper();
		robbie5.move();
		robbie5.putBeeper();
		robbie5.move();robbie5.putBeeper();
		robbie5.putBeeper();
		robbie5.move();
		robbie5.turnLeft();*/
		/*int bobby=2;
		double jeff=4.02;
		String dave="billy";
		int x=0;
		while(x<4){
			int o=0;
			while(o<4){
			
			robbie.putBeeper();
			robbie.move();
			robbie.turnLeft();
			o++;}
			x++;}*/
		
	
	

		//this turns the robot right
		/*public static void turnRight() {
		robbie5.turnLeft();
		robbie5.turnLeft();
		robbie5.turnLeft();
		}*/
	//this turns the robot right
	/*public static void turnRight() {
		robbie.turnLeft();
		robbie.turnLeft();
		robbie.turnLeft();
	}*/

       