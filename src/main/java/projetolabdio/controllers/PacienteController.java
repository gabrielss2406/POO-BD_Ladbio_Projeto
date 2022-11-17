/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.controllers;

import java.util.ArrayList;
import projetolabdio.controllers.DAO.PacienteDAO;
import projetolabdio.controllers.DAO.PagamentoDAO;
import projetolabdio.controllers.DAO.TratamentoDAO;
import projetolabdio.models.Pagamento;
import projetolabdio.models.Tratamento;

/**
 * Controller for Paciente actions in TelaPacienteC and TelaPacienteR
 * @author Gabriel Siqueira
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
    public boolean updatePacienteTelefone(int cpf, String telefone){
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
    public boolean updatePacienteEndereco(int cpf, String endereco){
        PacienteDAO pacienteDAO = new PacienteDAO();
        boolean req;

        req = pacienteDAO.updatePacienteEndereco(cpf, endereco);

        return req;
    }
}
