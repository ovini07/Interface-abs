package aula_dia2808;

public class Carro extends Veiculos_abs {

	@Override
	public  void acelerar() {
		System.out.println("Acelerando");
	}
	@Override
	public  void frear() {
		System.out.println("Freando");
	}
	@Override
	public  void virar() {
		System.out.println("Virando");
	}
	@Override
	public  void ligar() {
		System.out.println("ligando");
	}
}
