public class AlunoJava extends Aluno{

    public AlunoJava(String nome, Integer matricula) {
        super(nome, matricula);
    }


    public String toString() {
        return "AlunoJava: " + super.toString();
    }

}
