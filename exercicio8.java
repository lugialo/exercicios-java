import javax.swing.JOptionPane;
import java.util.Scanner;

public class exercicio8{
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int idade;

    System.out.println("Digite o valor da sua idade.");
    idade = entrada.nextInt();

    if (idade <= 0 and idade >= 3){
        JOptionPane.showMessageDialog(null, "Você é um bebê!"); 
            }
    else if (idade <= 4 and idade >=9){
        JOptionPane.showMessageDialog(null, "Você é uma criança!"); 
}
    else if (idade <= 10 and idade >= 13){
        JOptionPane.showMessageDialog(null, "Você é um pré-adolescente"); 
    }
    else if (idade <= 14 and idade >= 17){
        JOptionPane.showMessageDialog(null, "Você é um adolescente!"); 
    }
    else if (idade <=18 and idade >= 24){
        JOptionPane.showMessageDialog(null, "Você é um jovem!"); 
    }
    else if (idade <= 25 and idade >= 50){
        JOptionPane.showMessageDialog(null, "Você é um adulto!"); 
    }
    else if (idade >= 51){
        JOptionPane.showMessageDialog(null, "Você é um idoso!"); 
    } 
}
