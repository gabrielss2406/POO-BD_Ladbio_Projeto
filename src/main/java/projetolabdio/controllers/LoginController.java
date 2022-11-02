/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.controllers;

import static java.awt.image.ImageObserver.ERROR;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import projetolabdio.controllers.DAO.MedicoDAO;
import projetolabdio.models.Medico;
import projetolabdio.views.TelaMedico;

/**
 *
 * @author aluno
 */
public class LoginController {
    public boolean Login(String crm, String pass){
        MedicoDAO m = new MedicoDAO();
        
        // Verify simple test
        if(!"Insira seu CRM".equals(crm) && !"template".equals(pass) && !" ".equals(pass) && !" ".equals(crm)){
            // Search in DB
            Medico medico = m.selectMedicoLogin(parseInt(crm), pass);  
            
            if(medico!=null){ // Login sucess
                TelaMedico principal = new TelaMedico();
                principal.setVisible(true);
                Logged.setCrm(ERROR);
                return true;
            } 
            else { // Login fail
            JOptionPane.showMessageDialog(null, "CRM ou senha inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } 
        else { // Simple tests fail
            JOptionPane.showMessageDialog(null, "Insira CRM e senha", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
}
