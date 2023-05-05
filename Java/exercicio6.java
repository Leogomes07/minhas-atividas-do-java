import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            
            
            
                   
System.out.print("Digite a temperatura em graus Celsius: ");

double celsius = sc.nextDouble();  
double fahrenheit = (celsius * 9/5) + 32;        
double kelvin = celsius + 273.15;
            
            
            
            
  System.out.println("Temperatura em graus Fahrenheit: " + fahrenheit);
            
  System.out.println("Temperatura em graus Kelvin: " + kelvin);
    
 sc.close();
            
 }
 }

    
