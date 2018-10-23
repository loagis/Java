import java.util.Scanner;
public class Verteilung {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben sie die Anzahl der Äpfel ein!");
		int menge = scanner.nextInt();

		System.out.println("Geben sie die Mengen der Personen ein!");
		int personen = scanner.nextInt();

		System.out.print("Es werden "+menge+" Äpfel auf "+personen+" Personen verteilt.\n");
		System.out.print("Hierbei bekommt jeder "+teiler(menge,personen)+" Äpfel ");
		switch (rest(menge,personen)){
			case 0 :
				System.out.println("und es bleibt/bleiben keine Apfel übrig.");
			case 1 :
				System.out.println("und es bleibt 1 Apfel übrig.");
			default :
				System.out.print("und es bleiben "+rest(menge,personen)+" Äpfel übrig.");
		}

	}

	static int teiler(int menge, int personen){
		return menge / personen;
	}

	static int rest(int menge, int personen){
		return menge % personen;
	}
}
