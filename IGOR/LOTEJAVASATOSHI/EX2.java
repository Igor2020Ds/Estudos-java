/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**2.	Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 *
 * @author Igor Augusto Medeia
 */


 import javax.swing.JOptionPane;


 public class EX2{

    public static void main(String [] args){

        double salario, fator, salarioNovo;

        salario=Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário"));
        
        
        fator = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor percentual do reajuste salarial"));

        fator= (fator/100);

        salarioNovo=salario+(salario*fator);

    JOptionPane.showMessageDialog(null, salarioNovo);
        


    }
 }