package candidatura;

public class ProcessoSeletivoTres {
	public static void main(String[] args) {
		case3();
		
	}
	static void case3() {
		String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		
		//forma indexada
		//quando preciso do indice para complementar a lógica
		System.out.println("Imprimindo com a ordem de seleção pelo índice");
		for(int x=0; x<candidatosSelecionados.length; x++) {
			System.out.println((x+1)+ "° Candidato é " + candidatosSelecionados [x] );
		}
		
		//forma abrevida
		//interação total sem precisar da posição ou indice
		System.out.println("Imprimindo todos sem a necessidade de exibir o índice");
		
		for(String candidato: candidatosSelecionados) {
			System.out.println(candidato);
		}
		
	}
}