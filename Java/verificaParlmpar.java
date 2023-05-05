/*Operadores logicos 
 * && -> E
 * || -> ou
 * != -> diferente
 * == -> verifica o conteudo das variaveis
 * 
 * IF -> Se
 * ElSE -> Se não
 * 
 */

import java.util.Scanner;

public class verificaParlmpar {

public static void main(String[] args) {
    Scanner Sc = new Scanner (System.in);
    System.out.println("digite um numero");
int num = Sc.nextInt();


if (num%2==0){ // se o resto da divisão for zero
System.out.println("par");
}
else{

System.out.println("impar");

}
Sc.close();

}

    
}
