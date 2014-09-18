/*
 *PredicatesApp.java
 *@author Joanna Bautista
 *26/11/2012
 */

 import javax.swing.JOptionPane;

 public class PredicatesApp{
	 public static void main(String args[]){
		 int x, y;
		 boolean conjunction;
		 boolean disjunction;
		 boolean negation;


		 Predicates myP = new Predicates();

		x = Integer.parseInt(JOptionpane.showInputDialog(null, "Please enter a value for X to calculate the conjunction of P(x) and Q(y), the disjunction of P(x) and Q(y)and the negation of P(x):"));
		myP.setX(x);

				if((x%2)==0){ //x is even
					x = true;
				}
				else{
					x = false;
				}
				if(y==<10){ //y is less than 10
					y=true;
				}
				else y=false;

				//conjunction
				myP.setX(x);
				myP.setY(y);
				myP.computeconjunction();
				conjunction = myP.getConjunction();

				JOptionPane.showMessageDialog(null,"The conjunction of px and qy is " +conjunction);

				//disjunction
				myP.setX(x);
				myP.setY(y);
				myP.computedisjunction();
				disjunction = myP.getDisjunction();

				JOptionPane.showMessageDialog(null,"The disjunction of px and qy is " +disjunction);

				//negation
				myP.setX(x);
				myP.computenegation();
				negation = myP.getNegation();

				JOptionPane.showMessageDialog(null,"The negation of px is" +negation);
			}

}




