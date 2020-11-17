package animals;

public class Pet {

	private static String name;
	private static int age;
	private static String location;
	private static String type;

	public Pet(String name, int age, String location, String type) {
		Pet.name = name;
		Pet.age = age;
		Pet.location = location;
		Pet.type = type;
	}

	public Pet() {

	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Pet.name = name;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Pet.age = age;
	}

	public static String getLocation() {
		return location;
	}

	public static void setLocation(String location) {
		Pet.location = location;
	}

	public static String getType() {
		return type;
	}

	public static void setType(String type) {
		Pet.type = type;
	}

	public static void main(String[] args) {

		Pet.getName();
		Pet.getAge();
		Pet.getType();

		System.out.printf(Pet.name + "\n");
		System.out.print(Pet.age + "\n");
		System.out.printf(Pet.location + "\n");
		System.out.printf(Pet.type + "\n");

		Pet.setName("Gus");
		Pet.setAge(4);
		Pet.setLocation("Inside");
		Pet.setType("cat");

		System.out.printf(Pet.name + "\n");
		System.out.print(Pet.age + "\n");
		System.out.printf(Pet.location + "\n");
		System.out.printf(Pet.type + "\n");

	}

}
