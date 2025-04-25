/*encapsulamento*/
//public
//private
//protected
//package
public class Aluno {

    //variáveis = atributos
    //caratecterísca
    private  String nome; //atributo do tipo texto
    private  int idade;   //atributo do tipo número 
    private  boolean temFaculdade; // atributo do tipo Booleano (o e 1)

    public Aluno(){


    }
    public Aluno(String nome,int idade, boolean temFaculdade){
       this.nome = nome;
       this.idade = idade;
       this.temFaculdade = temFaculdade;
    }
    public String getNome(){ //método para pegar o nome
        return nome;
    }
    public int getIdade(){ // método para pegar a idade 
        return idade; 
    }
    public boolean getTemFaculdade(){ //método para pegar temFaculdade
        return temFaculdade;
    }


}
