package prog2_aula6;
import java.util.Scanner;

public class Aula6_Vetores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor [] = new int[10];
		for(int i = 0; i < vetor.length;i++) {
			System.out.println("Digite 10 número inteiros:");
			vetor[i] = entrada.nextInt();			
		}
			System.out.println("Ao contrário:");
		for (int i = 9; i >= 0; i--) {
			System.out.print(" " + vetor[i]);
		}
			
		}

	}

