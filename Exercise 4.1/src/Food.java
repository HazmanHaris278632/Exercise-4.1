
import java.util.Scanner;
public class Food {
	
	Scanner s = new Scanner(System.in);
	
	private String name;
	private String taste;
	private int quantity;
	private double price;
	
	Food() {
		System.out.println("\nEnter food name : ");
		this.name = s.nextLine();
		System.out.println("Enter food taste : ");
		this.taste = s.nextLine();
		System.out.println("Enter quantity to buy : ");
		this.quantity = s.nextInt();
		System.out.println("Enter food price : ");
		this.price = s.nextDouble();
	}
	
	//Getter method
	public String getName() {
		return name;
	}
	public String getTaste() {
		return taste;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	

}
