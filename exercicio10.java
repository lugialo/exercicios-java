import javax.swing.JOptionPane;

public class exercicio10 {

    public static void main(String[] args) {
        int idade;
        String aux="";
        float nota1=0, nota2=0, trabalho=0, media=0;
        try{
            aux = JOptionPane.showInputDialog(null, "Nota 1");
            nota1 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog(null, "Nota 2");
            nota2 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog(null, "Nota trabalho");
            trabalho = Float.parseFloat(aux);

            media = (nota1+nota2+trabalho)/3;
            JOptionPane.showMessageDialog(null, "ahahaa teste " + media);


        }
        catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "ahahahtqetewtwe");
        }





    }
    
}
