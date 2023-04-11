
package Model;

import javax.swing.JOptionPane;


public class ClasseX_DAO {
    public static String op;
    public static Double v1,v2,res;
        

    public static void soma(){
        String valor1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
        v1 = Double.parseDouble(valor1);
        
        String valor2 = JOptionPane.showInputDialog(null, "Digite o Segundo valor");
        v2 = Double.parseDouble(valor2);
        
        res = v1+v2;
        JOptionPane.showMessageDialog(null, "O resultado é: "+res);
    }
    public static void sub(){
        String valor1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
        v1 = Double.parseDouble(valor1);
        
        String valor2 = JOptionPane.showInputDialog(null, "Digite o Segundo valor");
        v2 = Double.parseDouble(valor2);
        
        res = v1-v2;
        JOptionPane.showMessageDialog(null, "O resultado é: "+res);
    }
    public static void mult(){
        String valor1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
        v1 = Double.parseDouble(valor1);
        
        String valor2 = JOptionPane.showInputDialog(null, "Digite o Segundo valor");
        v2 = Double.parseDouble(valor2);
        
        res = v1*v2;
        JOptionPane.showMessageDialog(null, "O resultado é: "+res);
    }
    public static void div(){
        String valor1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
        v1 = Double.parseDouble(valor1);
        
        String valor2 = JOptionPane.showInputDialog(null, "Digite o Segundo valor");
        v2 = Double.parseDouble(valor2);
        
        if( v2 <= 0){
            JOptionPane.showMessageDialog(null, "O segundo numero não pode ser negativo", "Erro", 3);
        }else{
            res = v1/v2;
            JOptionPane.showMessageDialog(null, "O resultado é: "+res);
        }
         
    }
    
    
}

