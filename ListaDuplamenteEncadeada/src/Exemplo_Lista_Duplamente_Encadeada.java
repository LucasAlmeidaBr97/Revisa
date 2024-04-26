
import java.util.Scanner;
import javax.sound.midi.Soundbank;


public class Exemplo_Lista_Duplamente_Encadeada {
    
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        ListaDuplaEncadeada lista = new ListaDuplaEncadeada();
        String elemento = null;
        String opcao = null;
        int posicao = 0;
        
        do{
            System.out.println("\nEscolha a opcao: \n");
            System.out.println("1 -> Adicionar elemento");
            System.out.println("1.1 -> Adicionar elemento na posicao");
            System.out.println("2 -> Excluir elemento na posicao especifica");
            System.out.println("3 -> Excluir elemento");
            System.out.println("4 -> Exibir o elemento anterior(antecessor)");
            System.out.println("5 -> Consultar a posicao de um elemento");
            System.out.println("6 -> Consultar elementos de  uma posicao");
            System.out.println("7 -> Consultar o tamanho da Lista");
            System.out.println("8 -> Exibir o primeiro elemento da Lista");
            System.out.println("9 -> Exibir o ultimo elemento da Lista");
            System.out.println("10 -> Exibir o maior elemento da lista");
            System.out.println("0 -> Exibir a lista completa");
            System.out.println("s -> Sair da aplicacao");
            
            opcao = entrada.next();
          
            
            if(opcao.equals("1")){
                System.out.println("\nInforme o valor do elemento");
                elemento = entrada.next();
                try {
                    lista.adicionar(elemento);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if(opcao.equals("1.1")){
                
            }
        
    }
    
}
