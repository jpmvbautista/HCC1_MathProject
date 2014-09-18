/*
 *Function.java
 *@author Joanna Bautista
 *4th December 2012
 */

 public class Function{
	 private int x;
	 private int y;
	 private int f;
	 private int g;
	 private int inverseF;
	 private int inverseG;

	 public Function(){
		 x = 0;
		 inverseF = 0;
		 inverseG = 0;

	}

	public void setX(int x){
		this.x = x;
	}


	//compute method(s)
	public void computef(){
	y = (x*x)+(2*x)+1;
	}

	public void computeg(){
	y = (9*x*x)-1;
	}

	public void computeinverseF(){
	y=(int)Math.sqrt(x)-1;
	}

	public void computeinverseG(){
	y = (int)Math.sqrt((x+1)/9);
	}


	 public int getY(){
		 return y;
	 }
 }