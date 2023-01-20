import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {

    public Turma (Professor b,Aluno...Lista){

        incluirProfessor(b);
        for(Aluno aluno:Lista)
            incluirAluno(aluno);

    }
    public void ordenarAlunos(){

        Collections.sort(this.getAlunos());
    }
private Professor professor;

    private List<Aluno> listaDeAlunos =new ArrayList<>();

    public void incluirAluno(Aluno aluno1){
        this.listaDeAlunos.add(aluno1);
    }

    public void incluirProfessor(Professor professor) {

        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return listaDeAlunos;
    }

    public String getProfessor(){

        return this.professor.toString();
    }

    public String toString() {
        return "A Turma é composta pelo seguinte professor:" + professor + "e pelos seguintes alunos:"+ listaDeAlunos + '.';}

}





