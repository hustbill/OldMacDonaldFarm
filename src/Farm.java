import java.util.*;
//http://www.chegg.com/homework-help/questions-and-answers/lab-assignment-a201-old-macdonald-background-lab-use-well-known-song-old-macdonald-farm-le-q1227365
// http://www.comp.nus.edu.sg/~cs1020/tut/15s2/tut02/T2.pdf
//http://kermit.kishwaukeecollege.edu/~dklick/cis260/
public class Farm {
	private ArrayList myFarm = new ArrayList();

	public Farm() {
		myFarm.add(new Cow("cow","moo"));
		myFarm.add(new Dog());
		myFarm.add(new Pig());
	}

	public void animalSounds() {
		Animal temp;
		for (int i = 0; i < myFarm.size(); i++) {
			temp = (Animal) myFarm.get(i);
			System.out.println(temp.getType() + " goes " + temp.getSound());
		}
	}
	
	
	public void Sing(String[] a) {
		String o = "Old MacDonald had a farm", e = ", Ee-i-ee-i-oh!", x = " a " + a[1], s = x + " " + a[1];
		System.out.print(o + e + ",\nAnd on that farm he had a " + a[0] + e + ",\nWith" + s + " here and" + s
				+ " there,\nHere" + x + ", there" + x + ", everywhere" + s + ",\n" + o + e + "!");
	}
}
