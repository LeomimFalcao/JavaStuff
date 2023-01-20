import java.util.List;
import java.util.Collections;

public class Sistema {

    public Sistema (){}

    public static void main() {
        Aluno x = new AlunoJava("Rafael", 3060);
        Aluno y = new AlunoJava("Sarraceno", 3061);
        Aluno z = new AlunoJava("Franco", 3062);

        Professor P = new Professor("Quitter");

        Turma TurmaJava = new Turma(P,x,y,z);

        System.out.println("Turma Java Listada sem ordenação: ");

        System.out.println();

        System.out.println(TurmaJava.getAlunos());

        System.out.println();

       TurmaJava.ordenarAlunos();

        System.out.println("Turma Java Listada com ordenação: ");

        System.out.println();
        System.out.println(TurmaJava.getAlunos());
        System.out.println(TurmaJava.getProfessor());

        System.out.println();

        Aluno a = new AlunoJavaScript("Galego", 3380);
        Aluno b = new AlunoJavaScript("Xandão", 3061);
        Aluno c = new AlunoJavaScript("Patrão", 3552);

        Professor R = new Professor("RUGAL");

        Turma TurmaJavaScript = new Turma(R,a,b,c);

        System.out.println("Turma JavaScript Listada sem ordenação: ");

        System.out.println(TurmaJavaScript.getAlunos());

        System.out.println();

        TurmaJavaScript.ordenarAlunos();

        System.out.println("Turma JavaScript Listada com ordenação: ");

        System.out.println();
        System.out.println(TurmaJavaScript.getAlunos());
        System.out.println(TurmaJavaScript.getProfessor());


    }

}

