public abstract class Pessoa implements Comparable<Pessoa>{
    private String nome;

    public Pessoa() {}


    public int compareTo(Pessoa segundaPessoa) {
        return this.nome.compareTo(segundaPessoa.nome);
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return nome;
    }
}
