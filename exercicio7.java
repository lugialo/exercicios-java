import java.util.Scanner;
public class exercicio7{

    public static void main  (String[] args){
    Scanner entrada = new Scanner(System.in);

    double salario, total;
    
    System.out.println("Digite o total de horas trabalhadas.");
    salario = entrada.nextDouble();
    total = (salario * 10.25);
        if (total < 50){
    System.out.println("Atenção, dirija-se à direção do Hotel!");
    System.out.println("O valor pago é: " + total); 
        }else{  
    System.out.println("O valor pago é: " + total);
    }
    }
}