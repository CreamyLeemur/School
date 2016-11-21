package dawson112.labexercises;

public class AnimalFarm {
	public static void main(String[] args) {
		Mouse mickey = new Mouse("Mickey", 100);
		Mouse minnie = new Mouse("Minnie", 100);
		
		mickey.squeal();
		minnie.squeal();
		
		Dog odie = new Dog("Odie", 5);
		Dog scooby = new Dog("Scooby", 5);
		
		odie.bark();
		scooby.bark();
		
		while (mickey.getHealth() >= 5) {
			odie.attack(mickey);
			mickey.squeal();
		}
		
		mickey.squeal();
	}
}