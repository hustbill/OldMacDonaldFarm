// testing class
public class OldMacDonald {

	public static void main(String[] args) {
		String[] farmNames = {"Old McDonald", "Vieux Maturin"};
		for (String farmName : farmNames) {
			Farm farm  = new  Farm(farmName) ;
			//farm.animalSounds();
			farm.sing();
		}
	}

}
