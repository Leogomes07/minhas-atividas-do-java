import java.util.Scanner;;

public class verificaNumero2 {
public static void main(String[] args) {

    Scanner Sc = new Scanner (System.in);
System.out.println("digite um numero");
int num = Sc. nextInt();

if (num>0){
System.out.println("numero positivo");
}
else if (num<0){
    System.out.println("numero negativo");
}
else {
    System.out.println("é ZERU MANU !!!");
}
Sc.close();
    }
}
