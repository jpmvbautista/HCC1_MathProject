/*
 *FunctionApp.java
 *@author Joanna Bautista
 *4th December 2012
 */

 import javax.swing.JOptionPane;

 public class FunctionApp{
	 public static void main(String args[]){
		 int x, inverseF, inverseG, y;


		Function myF = new Function();


		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a value for X to calculate fof, gog, fog, gof, f-1of and g-1og: "));
		myF.setX(x);


		//fof
		myF.setX(x);
		myF.computef();
		y = myF.getY();
		myF.setX(y);
		myF.computef();
		y = myF.getY();

		JOptionPane.showMessageDialog(null,"The result of fof is " +y);

		//gog
		myF.setX(x);
		myF.computeg();
		y  = myF.getY();
		myF.setX(y);
		myF.computeg();
		y = myF.getY();

		JOptionPane.showMessageDialog(null,"The result of gog is " +y);


		//fog
		myF.setX(x);
		myF.computeg();
		y = myF.getY();
		myF.setX(y);
		myF.computef();
		y = myF.getY();

		JOptionPane.showMessageDialog(null,"The result of fog is " +y);


		//gof
		myF.setX(x);
		myF.computef();
		y = myF.getY();
		myF.setX(y);
		myF.computeg();
		y = myF.getY();

		JOptionPane.showMessageDialog(null,"The result of gof is " +y);

		//f-1of
		myF.setX(x);
		myF.computef();
		y = myF.getY();
		myF.setX(y);
		myF.computeinverseF();
		y = myF.getY();

		JOptionPane.showMessageDialog(null,"The result of f-1of is " +y);

		//g-1og
		myF.setX(x);
		myF.computeg();
		y = myF.getY();
		myF.setX(y);
		myF.computeinverseG();
		y = myF.getY();

		JOptionPane.showMessageDialog(null,"The result of g-1og is " +y);
	  }
	}
