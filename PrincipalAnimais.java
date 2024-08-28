package aula_dia2808;

public class PrincipalAnimais {
public static void main(String[] args) {
	Lobo1 lobo = new Lobo1();
	lobo.setNome("Lobo Cinzento");
	lobo.setSexo("Macho");
	lobo.setRaca("Canis Lupus");
	lobo.emitirSom();
	lobo.caminhar();

	Gato gato = new Gato();
	gato.setNome("Gatinho");
	gato.setSexo("Fêmea");
	gato.setRaca("Siamês");
	gato.emitirSom();
	gato.dormir();

	Leao1 lion = new Leao1();
	lion.setNome("Gatinho");
	lion.setSexo("Fêmea");
	lion.setRaca("Siamês");
	lion.emitirSom();
	lion.dormir();
	
	Tigre tiger = new Tigre();
	tiger.setNome("Gatinho");
	tiger.setSexo("Fêmea");
	tiger.setRaca("Siamês");
	tiger.emitirSom();
	tiger.correr();
	
	Cachorro dog = new Cachorro();
	dog.setNome("Gatinho");
	dog.setSexo("Fêmea");
	dog.setRaca("Siamês");
	dog.emitirSom();
	dog.caminhar();
}
	public static void exibirDadosLobo(Lobo1 lobo) {
        System.out.println("----- Lobo -----");
        System.out.println("Nome: " + lobo.getNome());
        System.out.println("Sexo: " + lobo.getSexo());
        System.out.println("Raça: " + lobo.getRaca());
        System.out.println("Som emitido: ");
        lobo.emitirSom();
        System.out.println("Ação: Dormir");
        lobo.dormir();
        System.out.println("Ação: Caminhar");
        lobo.caminhar();
        System.out.println("Ação: Correr");
        lobo.correr();
    }

    public static void exibirDadosGato(Gato gato) {
        System.out.println("----- Gato -----");
        System.out.println("Nome: " + gato.getNome());
        System.out.println("Sexo: " + gato.getSexo());
        System.out.println("Raça: " + gato.getRaca());
        System.out.println("Som emitido: ");
        gato.emitirSom();
        System.out.println("Ação: Dormir");
        gato.dormir();
        System.out.println("Ação: Caminhar");
        gato.caminhar();
        System.out.println("Ação: Correr");
        gato.correr();
    }

    public static void exibirDadosLeao(Leao1 leao) {
        System.out.println("----- Leão -----");
        System.out.println("Nome: " + leao.getNome());
        System.out.println("Sexo: " + leao.getSexo());
        System.out.println("Raça: " + leao.getRaca());
        System.out.println("Som emitido: ");
        leao.emitirSom();
        System.out.println("Ação: Dormir");
        leao.dormir();
        System.out.println("Ação: Caminhar");
        leao.caminhar();
        System.out.println("Ação: Correr");
        leao.correr();
    }

    public static void exibirDadosTigre(Tigre tigre) {
        System.out.println("----- Tigre -----");
        System.out.println("Nome: " + tigre.getNome());
        System.out.println("Sexo: " + tigre.getSexo());
        System.out.println("Raça: " + tigre.getRaca());
        System.out.println("Som emitido: ");
        tigre.emitirSom();
        System.out.println("Ação: Dormir");
        tigre.dormir();
        System.out.println("Ação: Caminhar");
        tigre.caminhar();
        System.out.println("Ação: Correr");
        tigre.correr();
    }

    public static void exibirDadosCachorro(Cachorro cachorro) {
        System.out.println("----- Cachorro -----");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Sexo: " + cachorro.getSexo());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Som emitido: ");
        cachorro.emitirSom();
        System.out.println("Ação: Dormir");
        cachorro.dormir();
        System.out.println("Ação: Caminhar");
        cachorro.caminhar();
        System.out.println("Ação: Correr");
        cachorro.correr();

}
}
