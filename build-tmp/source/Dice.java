import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

int sum = 0;
public void setup()
{
  
  noLoop(); 
}
public void draw()
{
	background(0);
    for(int x = 0; x<=500; x+=50)
    {
    	for(int y = 0; y<=500; y+=50)
    	{
        Die bob = new Die(x,y);
        bob.show();
        }
    }
    fill(255);
    textSize(30);
    text("Total:"+sum,180,250);
}
public void mousePressed()
{
	redraw();
	 sum = 0;
}
class Die 
{
	int myX, myY,h; 
	Die(int x, int y)
	{
	   
	  myX = x;
	  myY = y; 
	  h = (int)(Math.random()*6)+1;
	}
	public void roll()
	{
       
    }
	public void show()
	{
	  fill(255,51,51,150);
	  rect(myX,myY,50,50,7);
      if(h==1)
	 {
	 	fill(0);
	 	ellipse(myX+25,myY+25,10,10); 
	 	sum+=1; 
	 	 
	 }
	 if(h==2)
	 {
	 	fill(0);
	 	ellipse(myX+12.5f,myY+12.5f,10,10);
	 	ellipse(myX+37.5f,myY+37.5f,10,10);
	 	sum+=2;
	 }
	 if(h==3)
	 {
	 	fill(0);
	 	ellipse(myX+12.5f,myY+12.5f,10,10);
	 	ellipse(myX+37.5f,myY+37.5f,10,10);
	 	ellipse(myX+25,myY+25,10,10);
	 	sum+=3;
	 }
	 if(h==4)
	 {
	 	fill(0);
	 	ellipse(myX+12.5f,myY+12.5f,10,10);
	 	ellipse(myX+37.5f,myY+37.5f,10,10);
	 	ellipse(myX+37.5f,myY+12.5f,10,10);
	 	ellipse(myX+12.5f,myY+37.5f,10,10);
	 	sum+=4;
	 }
     if(h==5)
     {
     	fill(0);
	 	ellipse(myX+12.5f,myY+12.5f,10,10);
	 	ellipse(myX+37.5f,myY+37.5f,10,10);
	 	ellipse(myX+37.5f,myY+12.5f,10,10);
	 	ellipse(myX+12.5f,myY+37.5f,10,10);
	 	ellipse(myX+25,myY+25,10,10);
	 	sum+=5;
	 }
     if(h==6)
     {
     	fill(0);
	 	ellipse(myX+12.5f,myY+12.5f,10,10);
	 	ellipse(myX+37.5f,myY+37.5f,10,10);
	 	ellipse(myX+37.5f,myY+12.5f,10,10);
	 	ellipse(myX+12.5f,myY+37.5f,10,10);
	 	ellipse(myX+12.5f,myY+25,10,10);
	 	ellipse(myX+37.5f,myY+25,10,10);
	 	sum+=6;
	 }
   }
}
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
