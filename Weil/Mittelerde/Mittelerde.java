
public class Mittelerde {

	public static void main(String[] args) {
		Wesen[] gruppe = new Wesen[5];
		Hobbit frodo = new Hobbit("Frodo", 40);
		Hobbit bilbo = new Hobbit("Bilbo", 120);
		Magier gandalf = new Magier("Gandalf", 300);
		Elb legolas = new Elb("Legolas",200);
		Wesen gollum = new Wesen("Gollum", 120, 250);
		gruppe[0] = frodo;
		gruppe[1] = bilbo;
		gruppe[2] = gandalf;
		gruppe[3] = legolas;
		gruppe[4] = gollum;
		status(gruppe);
		frodo.wirdVerwundet(10);
		bilbo.wirdVerwundet(50);
		legolas.wirdVerwundet(25);
		gollum.wirdVerwundet(18);
		gandalf.heilt(frodo);
		gandalf.heilt(bilbo);
		gandalf.heilt(legolas);
		status(gruppe);
	}
	
	public static void status(Wesen[] gruppe) {
		System.out.println("Status: ");
		for (int i = 0; i < gruppe.length; i++) {
			System.out.println(gruppe[i].toString());
		}
		System.out.println();
	}

}
