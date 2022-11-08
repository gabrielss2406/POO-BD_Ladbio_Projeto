package projetolabdio.controllers;

import projetolabdio.controllers.DAO.MedicoDAO;
import projetolabdio.models.Medico;
import javax.swing.*;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

/**
 * Controller for register actions in TelaRegistroMedico
 * @author Francisco Pereira Guimarães
 * @since 08/11/2022
 * @version 1.0
 */
public class RegistroController {

    /**
     * Function for register new Medico in DB
     * @param crm Primary key of Medico
     * @param nome Attribute name of Medico
     * @param especialidade Attribute speciality of Medico
     * @param telefone Attribute phone of Medico
     * @param pass Attribute password of Medico
     * @return TRUE for successful login and FALSE for unsuccessful register
     */
    public boolean Registro(String crm, String nome, String especialidade, String telefone, String pass){
        MedicoDAO dao = new MedicoDAO();

        // Verify simple test
        if(!"Insira seu CRM".equals(crm) && !" ".equals(crm)
                && !"template".equals(pass) && !" ".equals(pass)
                && !"Insira seu telefone".equals(telefone) && !" ".equals(telefone)
                && !"Insira seu nome".equals(nome) && !" ".equals(nome)
                && !"Insira sua especialidade".equals(especialidade) && !" ".equals(especialidade)){
            int crm_int = parseInt(crm);

            // Create Medico object
            Medico medico = new Medico(crm_int, nome, telefone, especialidade, pass);

            // Insert in DB
            boolean funcionou = dao.insertMedico(medico);

            if(funcionou){ // Register sucess
                return true;
            }
            else { // Register fail
                JOptionPane.showMessageDialog(null, "Campos inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else { // Simple tests fail
            JOptionPane.showMessageDialog(null, "Insira todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
}
