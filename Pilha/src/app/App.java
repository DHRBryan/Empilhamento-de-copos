package app;
import jdk.nashorn.internal.parser.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numeroDeCopos, coposColocados, numeroFileiras;
        java.util.Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo ao app de empilhar copos!");
        System.out.println("-----------------------------------");
        System.out.println("Digite a quantidade de copos que deseja empilhar (Mínimo = 1, Máximo = 26)");
        numeroDeCopos = leitor.nextInt();
        coposColocados = numeroFileiras = 0;
        int coposUltimaFileira = numeroDeCopos;              //Representa a quantidade digitada pelo usuário decrementando os copos já colocados
        while(coposColocados < numeroDeCopos){
            aux -= coposColocados;
            numeroFileiras++;
            coposColocados += numeroFileiras;
        }
        for(int i = 0; i < numeroFileiras; i++){
            System.out.println("Fileira:" + numeroFileiras + "" + numeroFileiras);
        } 
    }
}