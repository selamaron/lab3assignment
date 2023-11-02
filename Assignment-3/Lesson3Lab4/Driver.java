package Lesson3Lab4;

public class Driver {

	public static void main(String[] args) {
		Address address = new Address("1000N. 4th St.", "Fairfield", "IA", "52557");
		Property[] properties = { new House(9000, address), new Condo(2, address), new Trailer(address) };
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println(totalRent);
	}
}
