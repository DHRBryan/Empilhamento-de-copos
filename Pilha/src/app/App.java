package app;
import jdk.nashorn.internal.parser.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numeroDeCopos, coposColocados, numeroFileiras = 0;
        Pilha torre = new Pilha();
        java.util.Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao app de empilhar copos!");
        System.out.println("-----------------------------------");
        System.out.println("Digite a quantidade de copos que deseja empilhar (Mínimo = 1, Máximo = 26)");
        numeroDeCopos = leitor.nextInt();

        while(coposColocados < numeroDeCopos){
            String copo = "|__|";
            torre.empilhar(novoCopo);
            coposColocados++;                    //Empilha objetos de copos um por na torre
        }
        while(!torre.pilhaVazia()){
            
        }
    }
}