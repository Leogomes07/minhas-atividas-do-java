
import java.util.Scanner;
public class exercicio8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
System.out.print("Digite o número do mês: ");
int mes = sc.nextInt();
int dias = 0;

if (mes == 2) {
dias = 28;
} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
dias = 30;
} else {
dias = 31;
}

System.out.println("O mês " + mes + " tem " + dias + " dias.");

sc.close();

}




}