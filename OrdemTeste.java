package prog2_aula6;

public class OrdemTeste {

	public static void main(String[] args) {
		
		
		int vetor[] = new int[10];
		Ordem b = new Ordem(vetor);
		b.preencherVetor();
		System.out.println(b.toString());
		b.inverter();
		
	}

}
