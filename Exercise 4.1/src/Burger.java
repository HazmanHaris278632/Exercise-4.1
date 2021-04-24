

public class Burger extends Food {
	
	private double totalprice, takehome;
	private int request;
	
	public Burger() {
		super.getName();
		super.getTaste();
		super.getQuantity();
		super.getPrice();
		

		do {
		      System.out.print("Choose Option > 1 : Eat here / 2 : Take home ");
		      this.request = s.nextInt();
				
		      if (request == 1 ) {
		    	  this.takehome = 0.00;
		    	  System.out.println("Eat here, no extra fee.");
		    	  break;
		      }
		      else if (request == 2 ) {
		    	  this.takehome = 1.00;
			System.out.println("Take home. Extra fee RM1.00");
			break;
		      }
		      else 
		      {
			System.out.println("Invalid! PLease enter option 1 or 2 only ");
		      }
		} while (request != 1 || request != 2);
	}
	public double getTakeHome() {
		return this.takehome;
		
		
	}
	public double totalPrice() {
		return getQuantity()*getPrice()+getTakeHome();
	}

}
