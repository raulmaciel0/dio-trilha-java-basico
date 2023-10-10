
public class SistemaIBGE {
	public static void main(String[] args) {
		for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome());
		}
		
		EstadoBrasileiro eb = EstadoBrasileiro.RIO_GRANDE_DO_SUL;
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println(eb.getSigla() + " - " + eb.getNome() + " Cod: " + eb.getIbge());
		
	}
}
