/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**6.	Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 *
 * @author Igor Augusto Medeia
 */

import javax.swing.JOptionPane;

public class EX6 {
    public static void main(String args[]) {
        int x, y;
        int z, zz;
        x = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));

    

        if (x > y) {
            z = x;
            zz = y;
        } else if (y > x) {
            z = y;
            zz = x;
        } else {
            JOptionPane.showMessageDialog(null, "Valores iguais");
            return; //
        }

        JOptionPane.showMessageDialog(null, "O maior é o " + z + " e o menor é o " + zz);
    }
}

