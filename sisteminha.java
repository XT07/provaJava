import java.util.Scanner;
import java.util.ArrayList;

public class sisteminha {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();

        int idProfessor = 1;
        int idAluno = 1;
        int idCurso = 1;
        int opt = 0;

        do {
            System.out.println("1 - Cadastrar Professor\n2 - Cadastrar Curso\n3 - Cadastrar Aluno\n4 - Listar Professores\n5 - Listar Cursos\n6 - Listar Alunos\n0 - Sair");
            opt = scanner.nextInt();

            switch(opt) {
                case 1: {
                    idProfessor++;

                    try {
                        System.out.println("Escreva o nome do professor");
                        String nome = scanner.next();
                        System.out.println("Escreva o departamento do professor");
                        String departamento = scanner.next();
                        Professor professor = new Professor(idProfessor, nome, departamento);
                        professores.add(professor);

                    } catch(Exception e) {
                        System.out.println("Coloque todas as informações válidas | ERR " + e);
                    }
                    break;
                }
                case 2: {
                    idCurso++;

                    try {
                        System.out.println("Escreva o nome do curso");
                        String nome = scanner.next();
                        System.out.println("Escreva a carga horária do curso");
                        String cargaHoraria = scanner.next();
                        System.out.println("Escreva o id do professor");
                        int professorId = scanner.nextInt();
                        Curso curso = new Curso(idCurso, nome, cargaHoraria, professorId);
                        cursos.add(curso);

                    } catch(Exception e) {
                        System.out.println("Coloque todas as informações válidas | ERR " + e);
                    }

                    break;
                }
                case 3: {
                    idAluno++;
                    try {
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

                    } catch(Exception e) {
                        System.out.println("Coloque todas as informações válidas | ERR " + e);
                    }

                    break;
                }
                case 4: {
                    professores.forEach(professor -> professor.exibir());

                    break;
                }
                case 5: {
                    cursos.forEach(curso -> {
                        curso.exibir();
                        professores.forEach(professor -> {
                            if(professor.pegarId() == curso.pegarIdProfessor()){
                                System.out.println("Nome do professor: ");
                                professor.mostrarNome();
                            };
                        });
                    });

                    break;
                }
                case 6: {
                    alunos.forEach(aluno -> aluno.exibir());

                    break;
                }
                case 0: {
                    System.out.println("Saindo...");

                    break;
                }
                default: {
                    System.out.println("Coloque um número válido");
                }
            }
        } while (opt != 0);

        scanner.close();
    }

    public static void main(String[] args) {
        menu();
    }
}
