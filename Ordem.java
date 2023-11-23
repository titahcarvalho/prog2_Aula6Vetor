package prog2_aula6;
import java.util.Scanner;
public class Ordem {
	private int vetor[];
	public Ordem (int vetor[]) {
		this.vetor = vetor;
		
	}
	public int[] getVetor() {
		return vetor;
	}
	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}
	public void inverter() {
		for( int j = 9; j >= 0; j--) {
			System.out.println(this.vetor[j]);
		} 
	}
		public void  preencherVetor() {
			Scanner entrada = new Scanner(System.in);
			for(int i = 0; i < vetor.length;i++) {
				System.out.println("Digite o " + (i + 1) + "° número: ");
				vetor[i] = entrada.nextInt();				
		}	
			entrada.close();
		
	} 
		public String toString () {
		return "Números na ordem inversa:" ;
		}
	
}
