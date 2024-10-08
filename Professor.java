public class Professor {
    //Atributos do professor
    int id;
    String nome;
    String departamento;

    //Constructor
    public Professor(int id, String nome, String departamento){
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
    }

    //Métodos
    public void exibir(){
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
    }

    public int pegarId(){
        return this.id;
    }

    public String mostrarNome(){
        return this.nome;
    }
}