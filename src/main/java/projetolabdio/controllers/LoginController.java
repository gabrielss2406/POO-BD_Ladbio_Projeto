/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.controllers;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import projetolabdio.controllers.DAO.MedicoDAO;
import projetolabdio.models.Medico;
import projetolabdio.views.TelaMedico;

/**
 * Controller for login actions in TelaLogin
 * @author Gabriel Siqueira
 * @since 02/11/2022
 * @version 1.1 (with Logged system)
 */
public class LoginController {
    /**
     * Consults the database (DAO Controllers) and make the auth process
     * @param crm Primary key of Medico table
     * @param pass Password of the user
     * @return TRUE for successful login and FALSE for unsuccessful login
     */
    public boolean Login(String crm, String pass){
        MedicoDAO m = new MedicoDAO();
        
        // Verify simple test
        if(!"Insira seu CRM".equals(crm) && !"template".equals(pass) && !" ".equals(pass) && !" ".equals(crm)){
            int crm_int = parseInt(crm);
            // Search in DB
            Medico medico = m.selectMedicoLogin(crm_int, pass);  
            
            if(medico!=null){ // Login sucess
                Logged.setCrm(crm_int);
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
