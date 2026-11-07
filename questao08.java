public class questao08 {
     public static void main(String[] args) {

        try{  Usuario usuario = null;

        System.out.println("Nome do usuário: " + usuario.getNome());}
        catch(NullPointerException e){
        System.out.println("A variável está vazia");}
        finally{
             System.out.println("A consulta foi finalizada");
        }

    }
}
class Usuario {

    private String nome = "Carlos";

    public String getNome() {
        return nome;
    }
}
