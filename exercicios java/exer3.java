import java.util.Scanner;

public class exer3{

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
double distancia, combustivel, consumo;

System.out.println("Digite a distancia percorrida (em km): ");
distancia = entrada.nextInt();
System.out.println("Digite o total de combustivel gasto (em litros): ");
combustivel = entrada.nextInt();
consumo = distancia / combustivel;

System.out.println("O consumo médio do automóvel eh: " + consumo + " km por litro.");









}















}
