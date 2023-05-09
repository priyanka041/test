package OOPsConcept2;

public class Overriding3 {

	public static void main(String[] args) {
		
		Overriding obj = new Overriding();
		obj. multiply();
		obj.addition();
		//obj.divide();
		
		Overriding obj1 = new Overriding2();
		obj1.addition();
		//obj1. divide(); can't access
		
		}
	
	}


