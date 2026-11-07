public class questao03 {
    
    public static void main(String[] args) {

       
       try{

        String valor = "abc";

        int numero = Integer.parseInt(valor); 
        System.out.println("Número convertido: " + numero);
    }
    
     catch(NumberFormatException e){
         System.out.println("Formato não aceito");
     }finally{
      
         System.out.println("tentativa de conversão finalizada");
     }
    }
}

