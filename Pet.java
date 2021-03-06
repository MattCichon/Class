package animals;

public class Pet {

	private String name;
	private int age;
	private String location;
	private String type;

	public Pet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}

	public Pet() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void main(String[] args) {

		this.getName();
		this.getAge();
		this.getType();

		System.out.printf(this.name + "\n");
		System.out.print(this.age + "\n");
		System.out.printf(this.location + "\n");
		System.out.printf(this.type + "\n");

		this.setName("Gus");
		this.setAge(4);
		this.setLocation("Inside");
		this.setType("cat");

		System.out.printf(this.name + "\n");
		System.out.print(this.age + "\n");
		System.out.printf(this.location + "\n");
		System.out.printf(this.type + "\n");

	}
}
