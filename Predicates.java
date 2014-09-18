/*
 *Predicates.java
 *@author Joanna Bautista
 *26/11/2012
 */

 public class Predicates{
 		private int x;
 		private int y;
 		private boolean conjunction;
 		private boolean disjunction;
 		private boolean negation;

 		public Predicates(){
			x = 0;
			y = 0;
		}
		public void setx(int x){
			this.x = x;
		}
		public void sety(int y){
			this.y = y;
		}

		//compute method(s)
		//conjunction
		public void computeconjunction(){
			if (x == true && y == true){
				conjunction = true;
			}
			else{
				conjunction = false;
			}
		}
			//disjunction
		public void computedisjunction(){
			if(x == false && y == false){
				disjunction = false;
			}
			else{
				disjunction = true;
			}
		}
			//negation
		public void computenegation(){
			if (x==true){
				negation=false;
		}
			else{
				negation =true;
		}
	}
		//get method
		public boolean getConjunction(){
			return conjunction;
		}
		public boolean getDisjunctin(){
			return disjunction;
		}
		public boolean getNegation(){
			return negation;
		}
	}



