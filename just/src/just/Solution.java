package just;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args)
    {
	   System.out.println("check");
	   Player p[] = new Player[4];
	   Scanner in = new Scanner(System.in);
	   int i=0;
	   in.nextLine();
   while(i<5)
	   {
	   System.out.println("loop");
	  //  int pid = in.nextInt();
	   int a= in.nextInt();
	   p[i].setPlayerId(a);
	  // in.nextLine();
	   p[i].setSkill(in.nextLine());
	   p[i].setLevel(in.nextLine());
	   p[i].setPoints(in.nextInt());
	   i++;
	   }
	   
	   String fskill = in.nextLine();
	   String flevel = in.nextLine();
	   
	   findPointsForGivenSkill(p, fskill);
	   
	   getPlayerBasedOnLevel(p, fskill, flevel);
        //code to read values 
        //code to call required method
        //code to display the result
    }

    public static int findPointsForGivenSkill(Player[] players, String skill)
      {
    	int num=0;
          for(int i=0;i<players.length;++i) {
        	  if(players[i].getSkill().equals(skill)) {
        		  num+=players[i].getPoints();
        	  }
          }
          return num;
      }

    public static Player getPlayerBasedOnLevel(Player[] players, String skill, String level)
      {
    	int ind=0;
    	for(int i=0;i<players.length;++i) {
      	  if(players[i].getSkill().equals(skill) &&
      			  players[i].getLevel().equals(level) &&
      			  players[i].getPoints()>=20){ 
      		  ind= i;
      		  break;
      	  }
        }
    	return players[ind];
      }
}

class Player
{
    //code to build Player class
	int playerId;
	String skill;
	String level;
	int points;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	
}
