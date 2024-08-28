package aula_dia2808;

public abstract class Animal1 {
    
    private String nome;
    private String sexo;
    private String raca;

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public void caminhar() {
        System.out.println(nome + " está caminhando.");
    }

    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    
    public abstract void emitirSom();

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
