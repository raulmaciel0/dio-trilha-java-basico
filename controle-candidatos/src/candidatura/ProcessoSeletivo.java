package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		imprimirSelecionados();
		for (String candidato : candidatos) {
			
		}
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"Felipe", "Fernanda", "Raul", "Julia", "Nágila"};
		System.out.println("Imprimeindo a lista de candidatos informando o indice do elemento");
		for(int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidato de numero " + (i + 1) + " é " + candidatos[i]);
		}
		
		System.out.println("Forma abreviada de interação for each");
		for(String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	
	static void selecaoCandidatos() {
		
		String [] candidatos = {"Felipe", "Fernanda", "Raul", "Julia", "Nágila", "Avando", "Ellis", "Rafael", "Otavio", "José"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salário: " + salarioPretendido);;
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
				candidatosSelecionados++;
			}			
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o Candidato!");
		}
		else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra-proposta");
		}
		else {
			System.out.println("Aguardando demais candidatos");
		}
	}
}
