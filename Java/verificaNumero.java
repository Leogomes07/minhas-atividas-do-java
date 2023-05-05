import java.util.Scanner;;

public class verificaNumero {
public static void main(String[] args) {

    Scanner Sc = new Scanner (System.in);
System.out.println("digite um numero");
int num = Sc. nextInt();

if (num>0){
System.out.println("numero positivo");
}
if (num<0){
    System.out.println("numero negativo");
}
if (num ==0){
    System.out.println("é ZERU MANU !!!");
}
Sc.close();
    }
}
