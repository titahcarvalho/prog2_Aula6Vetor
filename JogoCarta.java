package prog2_aula6;

public class JogoCarta {

	public static void main(String[] args) {
		String[] nipes = {"Ouros", "Copas", " Espadas", "Paus"};
		String[] faces = {"Az","2","3","4", "5", "6","7","8","9","10","Valete","Dama","Rei"};
	//as linhas abaixo recuperam de forma aleatoria do conteudo dos arrays
		String nipe = nipes[(int) (Math.random()*4)];
		String face = faces[(int) (Math.random()*faces.length)];
		//a linha abaixo exibe a carta sorteada
		System.out.println( face + " de " + nipe);
	}

}
