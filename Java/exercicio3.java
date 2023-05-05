import java.util.Scanner;
public class exercicio3 {
   public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);  

        String java ="java";
        System.out.println("escreva a palavra");
        String palavra=sc.next();
        boolean mesmonome=palavra.equals(java);
        
        
        
        System.out.println("tem o mesmo nome que ("+java+") ?" +mesmonome);




}
}