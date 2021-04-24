
public class Main {

	public static void main(String[] args) {
		
		Burger objBurger = new Burger();
		System.out.println("\nFood name : " + objBurger.getName());
		System.out.println("Food taste : " + objBurger.getTaste());
		System.out.println("Quantity : " + objBurger.getQuantity());
		System.out.printf("Food Price : RM%.2f",objBurger.getPrice());
		System.out.printf("\nExtra fee : RM%.2f",objBurger.getTakeHome());
		System.out.printf("\nTotal order : RM%.2f",objBurger.totalPrice());
		System.out.println();
		
		Waffle objWaffle = new Waffle();
		System.out.println("\nFood name : " + objWaffle.getName());
		System.out.println("Food taste : " + objWaffle.getTaste());
		System.out.println("Quantity : " + objWaffle.getQuantity());
		System.out.printf("Food price : RM%.2f",objWaffle.getPrice());
		System.out.printf("\nExtra fee : RM%.2f",objWaffle.getTakeHome());
		System.out.printf("\nTotal order : RM%.2f",objWaffle.totalPrice());
	}
	
}
      