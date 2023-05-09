package OOPsConcept2;

public class Interface2 implements Interface {
	
	public void credit() {
	System.out.println("50k");
	}
		
	public void security() {
	System.out.println("protected");
	
			}
	public void bal_enq() {
		System.out.println("available bal");
	}
	public void debit() {
		System.out.println("10k");
		
	}
	public static void main(String[] args) {
		
		System.out.println(Interface.min_balance);
		
		Interface2 i = new Interface2();
		i.credit();
		i.debit();
		i.bal_enq();
		i.security();
		Interface q = new Interface2();
		q.credit();
		
		
	}
	}

	

