package aula_dia2808;

public class Ferrari implements Veiculo {
	 
	  @Override
	  public void ligar() {
		  System.out.println("Ligando");
	  }
	  @Override
	  public void desligar() {
		  System.out.println("Desligando");
	  }
	  @Override
	  public void manobrar() {
		  System.out.println("Manobrando");
	  }
	  @Override
	  public void frear() {
		  System.out.println("Freanddo");
	  }
	  @Override
	  public void acelerar() {
		  System.out.println("Acelerando");
	  }
	  @Override
	  public void engatar() {
		  System.out.println("Engatando");
	  }
	}

