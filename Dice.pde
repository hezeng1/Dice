void setup()
{
  size(500,500);
  noLoop(); 
}
void draw()
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
}
void mousePressed()
{
	redraw();
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
	void roll()
	{
      
    }
	void show()
	{
	  fill(255,51,51,150);
	  rect(myX,myY,50,50,7);
      if(h==1)
	 {
	 	fill(0);
	 	ellipse(myX+25,myY+25,10,10); 
	 }
	 if(h==2)
	 {
	 	fill(0);
	 	ellipse(myX+12.5,myY+12.5,10,10);
	 	ellipse(myX+37.5,myY+37.5,10,10);
	 }
	 if(h==3)
	 {
	 	fill(0);
	 	ellipse(myX+12.5,myY+12.5,10,10);
	 	ellipse(myX+37.5,myY+37.5,10,10);
	 	ellipse(myX+25,myY+25,10,10);
	 }
	 if(h==4)
	 {
	 	fill(0);
	 	ellipse(myX+12.5,myY+12.5,10,10);
	 	ellipse(myX+37.5,myY+37.5,10,10);
	 	ellipse(myX+37.5,myY+12.5,10,10);
	 	ellipse(myX+12.5,myY+37.5,10,10);
     }
     if(h==5)
     {
     	fill(0);
	 	ellipse(myX+12.5,myY+12.5,10,10);
	 	ellipse(myX+37.5,myY+37.5,10,10);
	 	ellipse(myX+37.5,myY+12.5,10,10);
	 	ellipse(myX+12.5,myY+37.5,10,10);
	 	ellipse(myX+25,myY+25,10,10);
     }
     if(h==6)
     {
     	fill(0);
	 	ellipse(myX+12.5,myY+12.5,10,10);
	 	ellipse(myX+37.5,myY+37.5,10,10);
	 	ellipse(myX+37.5,myY+12.5,10,10);
	 	ellipse(myX+12.5,myY+37.5,10,10);
	 	ellipse(myX+12.5,myY+25,10,10);
	 	ellipse(myX+37.5,myY+25,10,10);
     }
	}
}
