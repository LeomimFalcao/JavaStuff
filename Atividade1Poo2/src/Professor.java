public class Professor extends Pessoa{

    public Professor(String nome) {
        super(nome);
    }

    public String toString() {
        return "Professor: " + super.toString();
    }
}
