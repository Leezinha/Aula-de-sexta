public class questao06 {
    
    public static void main(String[] args) {

       try{ String nome = null;

        System.out.println("Nome: " + nome.toUpperCase());}

        catch(NullPointerException e){
             System.out.println("A variável está vazia");}
             finally{  System.out.println("Operação de manipulação de texto finalizada");}
        

    }
}

