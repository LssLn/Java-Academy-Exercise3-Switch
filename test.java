import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero da 1 a 7: ");
		int intday = input.nextInt();
		
		switch(intday) {
		case 1:
			System.out.println("Il giorno è lunedì");
			break;
		case 2:
			System.out.println("Il giorno è martedì");
			break;
		case 3:
			System.out.println("Il giorno è mercoledì");
			break;
		case 4:
			System.out.println("Il giorno è giovedì");
			break;
		case 5:
			System.out.println("Il giorno è venerdì");
			break;
		case 6:
			System.out.println("Il giorno è sabato");
			break;
		case 7:
			System.out.println("Il giorno è domenica");
			break;
		}
	}
}
