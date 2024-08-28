package aula_dia2808;

public class Tigre extends Animal1 {

    @Override
    public void emitirSom() {
        System.out.println("O tigre ruge: Grrrrr!");
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
