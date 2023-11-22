package prog2_aula6;

public class Array_Matriz {

	public static void main(String[] args) {
		String[][] agenda = { { "Jose", "31999", "aluna-sistemas@gmail.com" },
				{ "Bill", "31999564", "bili@outlook.com" }, { "Line", "9732-54564", "line@hotmail.com" } };
				//a linha abaixo recupera o tellefone do jose																						
				//System.out.println(agenda[0][1]);																
				
				//usando for para recuperar e percorre todas os indices do array
				for (int i = 0; i < agenda.length; i++) {
					System.out.println("________________________________");
/*CLTR + ESPAÇO*/		for (int j = 0; j < agenda.length; j++) {
/*sysout + cltr + espaço*/						System.out.println(agenda[i][j]);
			}
					
		}																																															
	}

}
