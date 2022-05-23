package exercicio2;
import java.util.Scanner;
public class exer2{

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
int numero1, numero2; 
double soma, subtracao, multiplicacao, divisao;

System.out.println("Digite o primeiro numero: ");
numero1 = entrada.nextInt();

System.out.println("Digite o segundo numero: ");
numero2 = entrada.nextInt();

soma= numero1 + numero2;
subtracao = numero1 - numero2;
multiplicacao = numero1 * numero2;
divisao = numero1 / numero2;



System.out.println("O resultado da soma eh: " + soma);
System.out.println("-------------------------------------------------------------------------------");
System.out.println("O resultado da subtracao eh: " + subtracao);
System.out.println("-------------------------------------------------------------------------------");
System.out.println("O resultado da multiplicacao eh: " + multiplicacao);
System.out.println("-------------------------------------------------------------------------------");
System.out.println("O resultado da divisao eh: " + divisao);
System.out.println("-------------------------------------------------------------------------------");

    



}














}
