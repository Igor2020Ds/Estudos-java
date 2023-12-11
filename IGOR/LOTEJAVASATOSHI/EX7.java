/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *7.	Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 * @author Igor Augusto Medeia
 */

 import javax.swing.JOptionPane;

 public class EX7{
    public static void main(String [] args){

        double lenght, widht, heigth;

        lenght=Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento"));
        widht=Double.parseDouble(JOptionPane.showInputDialog("Informe a largura"));
        heigth=Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));

        double volume= lenght * widht * heigth;
JOptionPane.showMessageDialog(null, volume);
    }

  
 }