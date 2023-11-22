package prog2_aula6;


public class ExemploVetores {

	public static void main(String[] args) {
		String [] carros = { "Uno", "Fusca", "Camarro", "Ferrari"};
		//índice do array 		[0]		[1]		[2]		[3]		tamanho = 4	
		System.out.println("Tamanho do array: " + carros.length);
		System.out.println("Carros: " + carros[0]);
		System.out.println("Carros: " + carros[1]);
		System.out.println("Carros: " + carros[2]);
		System.out.println("Carros: " + carros[3]);
		//Agora para alterar o conteudo de um array, se usa o indice
		carros[2] = "Porsche";//modificando o indice 2
		System.out.println("Carros: " + carros[2]);
		System.out.println("------------------------------------");
		System.out.println("Carros: "); //carros.length retorna o comppprimento total dos indices, no caso de 0 a 3
		for (int i = 0; i < carros.length; i++) { //atalho uso do Ctrl+Space, seleciona o que for usar
			System.out.println(carros[i]);
		}
	
	}

}
