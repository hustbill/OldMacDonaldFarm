import java.util.*;

public class Farm {
	private ArrayList<Animal> myFarm = new ArrayList<Animal>();
	private String farmName = "Old McDonald";

	public Farm(String farmName) {
		this.farmName = farmName;
		
		if (farmName == "Old McDonald") {
			myFarm.add(new Cow("Cow", "Moo"));
			myFarm.add(new Pig("Pig", "Oink"));
			myFarm.add(new Dog("Dog", "Woof"));
		}

		if (farmName == "Vieux Maturin") {
			myFarm.add(new Cow("Vache", "Meuh"));
			myFarm.add(new Dog("Chien", "Ouah"));
			myFarm.add(new Pig("Cochon", "Groin"));
		}

	}

	public void sing() {
		String  s = "";
		
		for (Animal animal : myFarm) {
			s += farmName + " had a farm, Ee-i-ee-i-oh!\n";       
		            s += "And on that farm he had a " + animal.getType() + ", Ee-i-ee-i-oh!\n";
		            s += "With a " + animal.getSound() + " here, \nAnd a "  + animal.getSound() +" there\n";
		            s += "Here a " + animal.getSound() + ", there a " + animal.getSound() + ", \nEverywhere a "+ animal.getSound()  + "\n";
		        s += farmName + " had a farm, Ee-I-ee-i-oh!\n";
			System.out.print(s);
		}
	}

	public String getFarmName() {
		return farmName;
	}

	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}

}
