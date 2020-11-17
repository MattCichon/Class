package animals;

public class Hamburgers {

	private  String name;
	private  String meat;
	private  String cheese;

	public Hamburgers() {
		super();
	}

	public Hamburgers(String name, String meat) {
		super();
		this.name = name;
		this.meat = meat;
	}

	public Hamburgers(String name, String meat, String cheese) {
		super();
		this.name = name;
		this.meat = meat;
		this.cheese = cheese;
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public  String getMeat() {
		return meat;
	}

	public  void setMeat(String meat) {
		this.meat = meat;
	}

	public  String getCheese() {
		return cheese;
	}

	public  void setCheese(String cheese) {
		this.cheese = cheese;
	}

	public  boolean hasCheese(boolean cheese) {
		return hasCheese(true);
	}

	public  String yourOrder = name + meat + cheese;

	public  void main(String[] args) {

		this.getName();
		this.getMeat();
		this.getCheese();

		this.setName("Meatzilla \n");
		this.setMeat("five beef patties \n");
		this.setCheese("one pound of cheddar cheese \n");

		System.out.print(name + meat + cheese);
	}

}
