public class Aluno {
    //Atributos do aluno
    int id;
    String nome;
    String dtNsc;
    String cpf;
    int idCurso;

    //Construtor
    public Aluno(int id, String nome, String dtNsc, String cpf, int idCurso){
        this.id = id;
        this.nome = nome;
        this.dtNsc = dtNsc;
        this.idCurso = idCurso;
    }

    //Métodos
    public void exibir(){
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dtNsc);
        System.out.println("CPF: " + this.cpf);
        System.out.println("ID curso: " + this.idCurso);
    }
}