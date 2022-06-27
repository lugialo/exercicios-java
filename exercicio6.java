import java.util.Scanner;

import javax.print.event.PrintJobListener;
import javax.sound.sampled.SourceDataLine;
public class exercicio6 {

public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
double valor, total;
double hora;
  

System.out.println("Digite o total de horas trabalhadas. ");
hora = entrada.nextDouble();

total = (10.25 * hora);

System.out.println("O valor pago é: " + total);






}  
}
