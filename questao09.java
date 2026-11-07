import java.util.InputMismatchException;
import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{ System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Adição: " + (n1 + n2));
        System.out.println("Subtração: " + (n1 - n2));
        System.out.println("Multiplicação: " + (n1 * n2));
        System.out.println("Divisão: " + (n1 / n2));}
        catch(ArithmeticException e) {
    System.out.println("Erro:" + e.getMessage());
} catch(InputMismatchException e){
        System.out.print("entrada inválida");
    }finally{
        System.out.print("A calculadora foi encerrada");
    }

        sc.close();
    }
}


