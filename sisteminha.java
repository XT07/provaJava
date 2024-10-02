import java.util.Scanner;
import java.util.ArrayList;

public class sisteminha {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();

        int idProfessor = 1; // ID - Contador de ID do professor
        int idAluno = 1; // ID - Contador de ID do aluno
        int idCurso = 1; // ID - Contador de ID de Cursos
        int opt = 0;

        do{
            System.out.println("1 - Cadastrar Professor\n2 - Cadastrar Curso\n3 - Cadastrar Aluno\n4 - Listar Professores\n5 - Listar Cursos\n6 - Listar Alunos");
            opt = scanner.nextInt();
            switch(opt){
                case 1: {
                    idProfessor = idProfessor + 1;

                    try{
                        System.out.println("Escreva o nome do professor");
                        String nome = scanner.next();
                        System.out.println("Escreva o departamento do professor");
                        String departamento = scanner.next();
                        Professor professor = new Professor(idProfessor, nome, departamento);
                        professores.add(professor);

                        menu();
                    }catch(Exception e){
                        System.out.println("Coloque todas as informação válida | ERR " + e);
                    }

                    break;
                }
                case 2: {
                    idCurso = idCurso + 1;

                    try{
                        System.out.println("Escreva o nome do curso");
                        String nome = scanner.next();
                        System.out.println("Escreva a carga horária do curso");
                        int cargaHoraria = scanner.nextInt();
                        System.out.println("Escreva o id do professor");
                        int professorId = scanner.nextInt();
                        Curso curso = new Curso(idCurso, nome, cargaHoraria, professorId);
                        cursos.add(curso);

                        menu();
                    }catch(Exception e){
                        System.out.println("Coloque todas as informação válida | ERR " + e);
                    }

                    break;
                }
                case 3: {
                    idAluno = idAluno + 1;

                    try{
                        System.out.println("Escreva o nome do aluno");
                        String nome = scanner.next();
                        System.out.println("Escreva a data de nascimento do aluno");
                        String dtNsc = scanner.next();
                        System.out.println("Escreva o CPF do aluno");
                        String cpf = scanner.next();
                        System.out.println("Escreva o id do curso");
                        int cursoId = scanner.nextInt();
                        Aluno aluno = new Aluno(idAluno, nome, dtNsc, cpf, cursoId);
                        alunos.add(aluno);

                        menu();
                    }catch(Exception e){
                        System.out.println("Coloque todas as informação válida | ERR " + e);
                    }

                    break;
                }
                case 4: {
                    for (Professor professor : professores){
                        professor.exibir();
                    }

                    break;
                }
                case 5: {
                    for (Curso curso : cursos){
                        curso.exibir();
                    }

                    break;
                }
                case 6: {
                    for (Aluno aluno : alunos){
                        aluno.exibir();
                    }

                    break;
                }
                default: {
                    System.out.println("Coloque um número válido");
                }
            }
        }while(opt <= 0 && opt >= 7);

        scanner.close();
    }

    public static void main(String[] args){
        menu();
    }
}