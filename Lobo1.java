package aula_dia2808;

public class Lobo1 extends Animal1 {
	@Override
	public void emitirSom() {
		System.out.println("O lobo uiva: Auuuuuu!");
	}
	  @Override
		public void dormir() {
			System.out.println(getNome() + " está dormindo.");
		}
		@Override
		public void caminhar() {
			System.out.println(getNome() + " está caminhando.");
		}
		@Override
		public void correr() {
			System.out.println(getNome() + " está correndo.");
		}
	}
