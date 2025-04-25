

import java.util.Scanner; //importar uma classe externa  

public class AppEscola { // Pascal Casing
    //main
    //public = publico 
    //static = da classe 
    //void = retorno vazio 
    //main = princiopal 
    //String angs [] = parâmetro inicial 
    public static void main (String args[]){
         Scanner teclado = new Scanner(System.in);
         System.out.println("Qual o seu nome");
         String nome = teclado.nextLine();
         System.out.println("Qual a sua idade");
         int idade = teclado.nextInt();
         System.out.println("Tem Faculdade: 0-nao e 1-sim");
         boolean temFaculdade = teclado.nextBoolean();

        //mêtodo principal 
        //classe objeto = new construtor (parâmentros);

        Aluno aluno = new Aluno (nome,idade,temFaculdade);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getTemFaculdade());
    }
}

//DESAFIO
/*
 * Implementar 
 */