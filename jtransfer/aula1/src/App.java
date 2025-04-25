import java.io.FileWriter; //classe para escrever no arquivo 
import java.io.IOException; // classe para tratar exerções do arquivo 
import java.util.Scanner;

import javax.imageio.IIOException;  

public class App {
    /**
 * @param args
 * @throws Exception
 */
public static void main(String[] args) throws Exception {
        //declaração de variáveis 

        String nome; //refência 
        int opcaoTransporte; //camelCasing
        String meioTransporte = " ";
        // int - primitivo (adão e eva)

        //intereger - class 

        // classe para teclado 
        Scanner scanner = new Scanner (System.in);

        System.out.println("Pesquisa de transporte Diário");
        System.out.println("Digite seu nome");
        nome = scanner.nextLine();
        System.out.println(nome);
        System.out.println("como você vai ao trabalho?");

        System.out.println("1 - metro");
        System.out.println("2 - Onibus");
        System.out.println("3 - Caminhada");
        System.out.println("4 - Uber");
        System.out.println("5 - Taxi");
        System.out.println("6 - Carro");
        System.out.println("Escolha uma opção (1-6)");
        opcaoTransporte = scanner.nextInt();
        
        switch(opcaoTransporte){
        case 1:
               meioTransporte = "Metrô";break;
        case 2: 
               meioTransporte = "Ônibus";break; 
        case 3: 
               meioTransporte = "Caminhada";break;  
        case 4: 
               meioTransporte = "Uber";break;
        case 5: 
               meioTransporte = "Taxi";break;
        case 6: 
               meioTransporte = "Carro";break;
               
               
       }
       System.out.println("nome:" +nome+ ","+ "Meio do transporte: " + meioTransporte);

       try(FileWriter escritor = new FileWriter("dados.txt", true)){
        
         escritor.write(nome+","+ meioTransporte + "\n");
         System.out.println("dados gravados com sucesso");

       }catch(IOException e){

              System.out.println("Erro ao gravar os dados"+e.getMessage());
       }
       }
}       
        //exercicio
        //faça como eu fiz 
        //leia a opção opcaoTranposrte e mostre a opção lida
         

        //text de amanhã salvar os dados no arquivo
        // vamos salvar no (git e github)  
        