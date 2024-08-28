package aula_dia2808;

public class Principal2 {

	public static void main(String[] args) {
		Gamer Usuario = new Gamer();
		Home User = new Home();
		
     System.out.println("---Computador Gamer---");
     Usuario.carregandoSistema();
     Usuario.desligar();
     Usuario.ligar();
     Usuario.reiniciar();
     
     
     System.out.println("---Computador Home");
     User.carregandoSistema();
     User.desligar();
     User.ligar();
     User.reiniciar();
	}
}
