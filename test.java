import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero da 1 a 7: ");
		int intday = input.nextInt();
		
		switch(intday) {
		case 1:
			System.out.println("Il giorno � luned�");
			break;
		case 2:
			System.out.println("Il giorno � marted�");
			break;
		case 3:
			System.out.println("Il giorno � mercoled�");
			break;
		case 4:
			System.out.println("Il giorno � gioved�");
			break;
		case 5:
			System.out.println("Il giorno � venerd�");
			break;
		case 6:
			System.out.println("Il giorno � sabato");
			break;
		case 7:
			System.out.println("Il giorno � domenica");
			break;
		}
	}
}
