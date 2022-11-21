/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.controllers;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import projetolabdio.controllers.DAO.PacienteDAO;
import projetolabdio.controllers.DAO.PagamentoDAO;
import projetolabdio.controllers.DAO.TratamentoDAO;
import projetolabdio.models.Pagamento;
import projetolabdio.models.Paciente;
import projetolabdio.models.Tratamento;

/**
 * Controller for Paciente actions in TelaPacienteC and TelaPacienteR
 * @author Gabriel Siqueira, Francisco Guimarães
 * @since 05/11/2022
 * @version 2.0
 */
public class PacienteController {
    /**
     * Delete certain Paciente in database (DAO Controllers)
     * @param cpf Primary key of Medico table
     * @return TRUE for successful Delete and FALSE for unsuccessful Delete
     */
    public boolean deletePaciente(String cpf){
        PacienteDAO pac = new PacienteDAO();
        boolean req;

        req = pac.deletePaciente(cpf);

        return req;
    }
    
    /**
     * Consults the database (DAO Controllers) and get the list of all Tratamento researched by Pacientes's cpf
     * @param cpf Primary key of Paciente table
     * @return Researched Tratamento list
     */
    public ArrayList<Tratamento> selectTratamento(String cpf) {
        TratamentoDAO trat = new TratamentoDAO();
        ArrayList<Tratamento> tratamentos = new ArrayList<>();

        // Select tratamento
        tratamentos = trat.selectTratamento(cpf);

        return tratamentos;
    }

    /**
     * Connect whit PacienteDAO and request for update the Paciente's phone
     * @param cpf Primaty key of Paciente table
     * @param telefone Attribute telefone
     * @return TRUE for successful and FALSE for unsuccessful Update
     */
    public boolean updatePacienteTelefone(String cpf, String telefone){
        PacienteDAO pacienteDAO = new PacienteDAO();
        boolean req;
        
        req = pacienteDAO.updatePacienteTelefone(cpf, telefone);

        return req;
    }

    /**
     * Connect whit PacienteDAO and request for update the Paciente's address
     * @param cpf Primaty key of Paciente table
     * @param endereco Attribute telefone
     * @return TRUE for successful and FALSE for unsuccessful Update
     */
    public boolean updatePacienteEndereco(String cpf, String endereco){
        PacienteDAO pacienteDAO = new PacienteDAO();
        boolean req;

        req = pacienteDAO.updatePacienteEndereco(cpf, endereco);

        return req;
    }
    
    public boolean createPaciente(String cpf, String nome, String endereco, String telefone, String idade){
        boolean sucess = false;
        
        if(!"Insira o nome".equals(nome) && !" ".equals(nome)
                && !"Insira o telefone".equals(telefone) && !" ".equals(telefone)
                && !"Insira o endereco".equals(endereco) && !" ".equals(endereco)
                && !"Insira CPF (xxx.xxx.xxx-xx)".equals(cpf) && !" ".equals(cpf)
                && !"Insira idade".equals(idade) && !" ".equals(idade)){
            
                PacienteDAO pac = new PacienteDAO();
                Paciente paciente = new Paciente(cpf, nome, endereco, telefone, Integer.parseInt(idade), Logged.getCrm());
                sucess = pac.insertPaciente(paciente);
        }
        else
            JOptionPane.showMessageDialog(null, "Insira todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
        
        return sucess;
    }
}
