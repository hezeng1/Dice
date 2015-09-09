void setup()
{
  size(500,500); 
}
void draw()
{
	background(0);
    Die bob = new Die(20+x,20+y);
    bob.show();
}
void mousePressed()
{
	redraw();
}
class Die 
{
	int myX, myY; 
	Die(int x, int y) //constructor
	{
		
	}
	void roll()
	{
		//your code here
	}
	void show()
	{
	  rect(x,y,50,50);
	}
}
