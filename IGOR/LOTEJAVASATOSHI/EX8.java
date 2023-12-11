/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *8.	Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * @author Igor Augusto Medeia
 */
import javax.swing.JOptionPane;

public class EX8 {
	public static void main(String args[]) {
	
		double investimento, tempo;
		double rendimento = 1.3/100;

		investimento=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do investimento"));

		tempo =1;

		double valorAtual= investimento + investimento*rendimento;

		JOptionPane.showMessageDialog(null, valorAtual);


	}
}