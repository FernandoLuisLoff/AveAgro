/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author ferlo
 */
public class Funcoes {
    public void errorMessage(String title, String msg) {
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
    }
    
    public boolean confirmMessage(String title, String msg) {
        int confirmMessage = JOptionPane.showConfirmDialog(null, msg, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return confirmMessage == JOptionPane.YES_OPTION;
    }
}
