package dawson112.labexercises;

public class Dog {
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public void bark() {
		int ageInDogYears = this.age * 7;
		System.out.println("Ruff ruff, my name is " + this.name + "! Ruff! I am " + this.age + " years old. In dog years I am " + ageInDogYears + " years old");
	}
	
	public void attack(Mouse victim) {
		System.out.println("Grrrrrrr");
		victim.loseHealth();
	}
}
