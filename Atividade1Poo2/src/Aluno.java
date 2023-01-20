

public class Aluno extends Pessoa  {

    private Integer matricula;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public Aluno() {}


    public Integer getMatricula() {
        return matricula;
    }


    public String toString() {
        return super.toString() + " - Matrícula: " + this.matricula;
    }
}




