import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

       try{ System.out.print("Preço do produto: ");
        double preco = Double.parseDouble(sc.nextLine());

        System.out.print("Quantidade em estoque: ");
        int quantidade = Integer.parseInt(sc.nextLine());

        double total = preco * quantidade;

        System.out.println("\n--- PRODUTO CADASTRADO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor em estoque: R$ " + total);
    }

        catch(NumberFormatException e){
            System.out.println("Erro:" + e.getMessage());
        }finally{
             System.out.println("Encerrando cadastro");
        }

        sc.close();
    }
}
