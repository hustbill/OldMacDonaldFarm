public class Dog implements Animal {
	private String myType;
	private String mySound;

	public Dog(String type, String sound) {
		myType = type;
		mySound = sound;
	}

	public Dog() {
		myType = "Dog";
		mySound = "Woof";
	}

	public String getSound() {
		return mySound;
	}

	public String getType() {
		return myType;
	}
}
