/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package projetolabdio;
import projetolabdio.controllers.Logged;
import projetolabdio.views.user_auth.TelaLogin;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TelaLogin inicial = new TelaLogin();
        inicial.setVisible(true);
        Logged logged = new Logged();
    }
    
}
