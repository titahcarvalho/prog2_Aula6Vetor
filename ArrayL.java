package prog2_aula6;
import java.util.ArrayList;
public class ArrayL {

	public static void main(String[] args) {
		ArrayList<String> contatos = new ArrayList<>();
		contatos.add("Angélica de Carvalho");
		contatos.add("9999-9999");
		contatos.add("tita@email.com");
		contatos.add("Robson Vaamunde");
		contatos.add("5555-5555");
		contatos.add("vava@email.com");
		System.out.println("Tamanho do Array:" + contatos.size());
		System.out.println(contatos);
		
		System.out.println("E-mail Angélica de Carvalho (Índice [2] " + contatos.get(2));
		System.out.println("____________________________");
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println( contatos.get(i));
		}
	
	}

}
