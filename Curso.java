public class Curso {
    //Atributos do curso
    int id;
    String nome;
    int cargaHoraria;
    int idProfessor;

    //Construtor
    public Curso(int id, String nome, int cargaHoraria, int idProfessor){
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.idProfessor = idProfessor;
    }

    //Métodos
    public void exibir(){
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Carga horária: " + this.cargaHoraria);
        System.out.println("ID professor: " + this.idProfessor);
    }
}
