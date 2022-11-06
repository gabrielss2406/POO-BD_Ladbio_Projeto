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
 * @version 1.0
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
    public ArrayList<Tratamento> selectTratamento(String cpf){
        TratamentoDAO trat = new TratamentoDAO();
        ArrayList<Tratamento> tratamentos = new ArrayList<>();
        
        // Select tratamento
        tratamentos = trat.selectTratamento(cpf);
        
        return tratamentos;
    }
    
    /**
     * Consults the database (DAO Controllers) and get the list of all Pagamento related to Tratamento
     * @param tratamentos List of Tratamento to seach related Pagamento
     * @return Researched Pagamento list
     */
    public ArrayList<Pagamento> selectTratamentoPagamento(ArrayList<Tratamento> tratamentos){
        PagamentoDAO pag = new PagamentoDAO();
        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        
        // Select pagamento status
        for(Tratamento t : tratamentos){
            pagamentos.add(pag.selectPagamento(t.getId()));
        }
        
        return pagamentos;
    }
}
