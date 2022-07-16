
import javax.swing.JOptionPane;

public class exercicio10 {

    public static void main(String[] args) {
        
    
        String aux="";
        float peso=0;
        float imc=0;
        float altura=0;
        try{
            aux = JOptionPane.showInputDialog(null, "Digite seu peso (em kg!)");
            peso = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog(null, "Digite sua altura (em metros!)");
            altura = Float.parseFloat(aux);

            

            imc = (peso) / (altura * altura);
            
            if (imc < 18.5)
            {    
                JOptionPane.showMessageDialog(null, "Seu IMC é "+ imc + " e a categoria é 'Abaixo do normal'!"); 
            }
            else if (imc >= 18.5 && imc <= 24.4)
            {    
                JOptionPane.showMessageDialog(null, "Seu IMC é "+ imc + " e a categoria é 'Peso ideal'!"); 
            }
            else if (imc >= 24.5 && imc <= 29.9)
            {    
                JOptionPane.showMessageDialog(null, "Seu IMC é "+ imc + " e a categoria é 'Pré-obesidade'!"); 
            }
            else if (imc >= 30 && imc <= 34.9)
            {    
                JOptionPane.showMessageDialog(null, "Seu IMC é "+ imc + " e a categoria é 'Obesidade classe I'!"); 
            }
            else if (imc >= 35 && imc <= 39.9)
            {    
                JOptionPane.showMessageDialog(null, "Seu IMC é "+ imc + " e a categoria é 'Obesidade severa'!"); 
            }
            else if (imc > 39.9)
            {    
                JOptionPane.showMessageDialog(null, "Seu IMC é "+ imc + " e a categoria é 'Obesidade mórbida'!"); 
            }

        }
        catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro");
        }





    }
 
}
