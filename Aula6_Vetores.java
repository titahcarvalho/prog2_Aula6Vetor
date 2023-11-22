package prog2_aula6;
import java.util.Scanner;
import java.util.Arrays;
public class Aula6_Vetores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor [] = new int[10];
		for(int i = 0; i < vetor.length;i++) {
			System.out.println("Digite 10 número inteiros:");
			vetor[i] = entrada.nextInt();			
		}
			System.out.println("Na ordem crescente:");
		//for (int i = 9; i >= 0; i--) {
		//	System.out.print(" " + vetor[i]);
			Arrays.sort(vetor);
			System.out.println(Arrays.toString(vetor));
			
			entrada.close();
		}
			
	}


/*******************************************************************************/
/*import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int vetor[] = new int [11];
	    System.out.println("Digite 10 números inteiros para serem impressos em ordem invertida!");
	    
	    for (int i = 1; i < vetor.length; i++){
	        
	        System.out.println("Digite o " + i + "° número:");
	        vetor [i] = entrada.nextInt();
	        
	    } for ( int i = 10; i > 0; i--) {
	        //System.out.println("Os números impressos ao contrário são:");
	        System.out.println(" " + vetor[i]);
	    }
		
	}
}*/

		
		


