package animals;

public class Hamburgers {

	private static String name;
	private static String meat;
	private static String cheese;

	public Hamburgers() {
		super();
	}

	public Hamburgers(String name, String meat) {
		super();
		Hamburgers.name = name;
		Hamburgers.meat = meat;
	}

	public Hamburgers(String name, String meat, String cheese) {
		super();
		Hamburgers.name = name;
		Hamburgers.meat = meat;
		Hamburgers.cheese = cheese;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Hamburgers.name = name;
	}

	public static String getMeat() {
		return meat;
	}

	public static void setMeat(String meat) {
		Hamburgers.meat = meat;
	}

	public static String getCheese() {
		return cheese;
	}

	public static void setCheese(String cheese) {
		Hamburgers.cheese = cheese;
	}

	public static boolean hasCheese(boolean cheese) {
		return hasCheese(true);
	}

	public static String yourOrder = name + meat + cheese;

	public static void main(String[] args) {

		Hamburgers.getName();
		Hamburgers.getMeat();
		Hamburgers.getCheese();

		Hamburgers.setName("Meatzilla \n");
		Hamburgers.setMeat("five beef patties \n");
		Hamburgers.setCheese("one pound of cheddar cheese \n");

		System.out.print(name + meat + cheese);
	}

}
