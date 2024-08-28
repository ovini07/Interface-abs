package aula_dia2808;

public class PrincipalVeiculos {

	public static void main(String[] args) {
		
		Onibus busao = new Onibus();
		Carro fusca = new Carro();
		
		System.out.println("######################");
		System.out.println("BUSÃOO");
		busao.acelerar();
		busao.frear();
		busao.virar();
		busao.ligar();
		
		System.out.println("######################");
		System.out.println("FUSCAAA");
		fusca.acelerar();
		fusca.virar();
		fusca.frear();
		fusca.acelerar();
	}
}
