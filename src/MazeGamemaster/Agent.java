package MazeGamemaster;

import MazeGamemaster.Entity.Maze;

import java.awt.*;

/**
 * A class that creates all the elements necessary for a player
 * to traverse the maze.
 */
public class Agent {

	private static int money=0;
	public static Dimension startLoc = new Dimension();

	private Maze maze;

	public Agent(Maze maze){
		this.maze=maze;
	}

	public static void moveLeft(Maze maze){
		if((maze.getValue(startLoc.width-1, startLoc.height) != -1)){
			maze.setValue(startLoc.width, startLoc.height, (short) 0);
			if(maze.getValue(startLoc.width-=1, startLoc.height) == (short)-3 ) endGame();
			else if(maze.getValue(startLoc.width, startLoc.height) == 5) money++;
			else
				maze.setValue(startLoc.width, startLoc.height, (short)-2);
		}
		else
			maze.setValue(startLoc.width, startLoc.height, (short)-2);
		System.out.println("You got " + money);
	}


	public static void moveRight(Maze maze){
		if((maze.getValue(startLoc.width+1, startLoc.height) != -1) ){
			maze.setValue(startLoc.width, startLoc.height, (short) 0);
			if(maze.getValue(startLoc.width+=1, startLoc.height) == (short)-3 ) endGame();
			else if(maze.getValue(startLoc.width, startLoc.height) == 5) money++;
			else maze.setValue(startLoc.width, startLoc.height, (short)-2);
		}
		else
			maze.setValue(startLoc.width, startLoc.height, (short)-2);
		System.out.println("You got " + money);
	}


	public static void moveUp(Maze maze){
		if((maze.getValue(startLoc.width, startLoc.height+1) != -1) ){
			maze.setValue(startLoc.width, startLoc.height, (short) 0);
			if(maze.getValue(startLoc.width, startLoc.height+=1) == (short)-3 ) endGame();
			else if(maze.getValue(startLoc.width, startLoc.height) == 5) money++;
			else maze.setValue(startLoc.width, startLoc.height, (short)-2);
		}
		else
			maze.setValue(startLoc.width, startLoc.height, (short)-2);
		System.out.println("You got " + money);
	}

	public static void moveDown(Maze maze){
		if((maze.getValue(startLoc.width, startLoc.height-1) != -1) ){
			maze.setValue(startLoc.width, startLoc.height, (short) 0);
			if(maze.getValue(startLoc.width, startLoc.height-=1) == (short)-3 ) endGame();
			else if(maze.getValue(startLoc.width, startLoc.height) == 5) money++;
			else maze.setValue(startLoc.width, startLoc.height, (short)-2);
		}
		else
			maze.setValue(startLoc.width, startLoc.height, (short)-2);
		System.out.println("You got " + money);
	}

	public static void endGame(){
		System.out.println("End Game");
	}
}	
