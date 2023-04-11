
package Model;

import javax.swing.JOptionPane;


public class Tela_DAO {
    public static void solicitarOperacao(){
       // Model.ClasseX_DAO.op = JOptionPane.showInputDialog(null, "Digite o simbolo da operação desejada");
              
        /*if(Model.ClasseX_DAO.op.equals("+")){
            Model.ClasseX_DAO.soma();
        }
        if(Model.ClasseX_DAO.op.equals("-")){
            Model.ClasseX_DAO.sub();
        }
        if(Model.ClasseX_DAO.op.equals("*")){
            Model.ClasseX_DAO.mult();
        }
        if(Model.ClasseX_DAO.op.equals("/")){
            Model.ClasseX_DAO.div();
        }*/
               
       switch(Model.ClasseX_DAO.op = JOptionPane.showInputDialog(null, "Digite o Simbolo da operação Desejada")){
           case "+":
               Model.ClasseX_DAO.soma();
               break;
           case "-":
               Model.ClasseX_DAO.sub();
               break;
           case "*":
               Model.ClasseX_DAO.mult();
               break;
           case "/":
               Model.ClasseX_DAO.div();
               break;              
           default:
               JOptionPane.showMessageDialog(null, "Operação Inválida");
       }
    }
}
