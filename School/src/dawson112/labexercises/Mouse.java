package dawson112.labexercises;

public class Mouse {
	private String name;
	private int health;
	
	public Mouse(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setHealth(int newHealth) {
		this.health = newHealth;
	}
	
	public void squeal() {
		if (this.health <= 0) {
			System.out.println("I'm dead.");
		} else if (this.health > 0 && this.health < 10) {
			System.out.println("I'm almost dead.");
		} else {
			System.out.println("Sqqqqqqeeeak");
		}
	}
	
	public void loseHealth() {
		this.health -= 5;
	}
}
