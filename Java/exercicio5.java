import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    

        System.out.println("Digite numero inteiro");
        int num1 = sc.nextInt();

        System.out.println("Digite  numero inteiro");
        int num2 = sc.nextInt();

        System.out.println("Digite numero inteiro");
        int num3 = sc.nextInt();

        if (num1==num2 && num1==num3 ) {
            System.out.println("Triangulo equilatero, todas os angulos são iguais");
        }
        if (num1==num2 || num1==num3 || num2==num3) {
            System.out.println("Triango isoceles, apenas 2 lados são iguais");
        }
        if (num1!=num2 && num1!=num3 && num2!=num3){
            System.out.println("Triangulo escaleno, todos os lados são diferentes");
        }

    }
}