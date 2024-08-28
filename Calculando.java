package aula_dia2808;

public class Calculando implements Calculos {
	@Override
	public double somar() {
		return 10 + 15;
	}
	@Override
	public double sub() {
		return 15 - 10;
	}

	@Override
	public double mult() {
		return 5 * 5;
	}

	@Override
	public int div() {
		return 10 / 2;
	}

	@Override
	public int exp() {
		return 2 * 2 *2;
	}
}
