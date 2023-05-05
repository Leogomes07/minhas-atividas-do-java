import java.util.Scanner;


public class EstruturasCondicionais {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a sua idade");
    
    int idade = sc.nextInt();
    
    int idadeDeMaior = 18;

    if(idade>=idadeDeMaior){ // se for verdade
     System.out.println("o aluno é maior de idade");
    }
    else{
        System.out.println("o aluno ainda é menor de idade=)");
    }
   }  
}
