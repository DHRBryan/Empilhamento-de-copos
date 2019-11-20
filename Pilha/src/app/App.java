package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numeroDeCopos, coposColocados, numeroFileiras;
        Pilha torre = new Pilha();
        java.util.Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao pirâmide de copos invertida!");
        System.out.println("-----------------------------------");
        System.out.println("Digite a quantidade de copos que deseja empilhar (Mínimo = 1, Máximo = 26)");
        numeroDeCopos = leitor.nextInt();
        coposColocados = 0;
        numeroFileiras = 0;
        while(coposColocados < numeroDeCopos){
            String copo = "|__|";
            Copo novoCopo = new Copo(copo);
            torre.empilhar(novoCopo);
            coposColocados++;                    //Empilha objetos de copos um por na torre
        }
        coposColocados = 0;
        while(coposColocados < numeroDeCopos){
            numeroFileiras++;
            coposColocados += numeroFileiras;   //Algoritmo para descobrir o número de fileiras
        }
        System.out.println("A quantidade de fileiras é:" + numeroFileiras);
        while(!torre.pilhaVazia()){
            int aux = 0;
            while(aux < numeroFileiras){
                System.out.print(torre.retornaTopo());  //Retorna o copo no topo da pilha
                torre.desempilhar();                    //Desempilha para diminuir o tamanho da pilha
                aux++;
                if(aux == numeroFileiras-1){
                    aux = 0;                            //Recomeça a escrever os copos
                    numeroFileiras--;                   //Diminui o número de copos para botar na fileira de baixo
                    System.out.println();               //Pula para a próxima linha para escrever a próxima fileira
                }                  
            }
        }
    }
}