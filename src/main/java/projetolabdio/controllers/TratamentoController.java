/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.controllers;

import projetolabdio.controllers.DAO.PagamentoDAO;
import projetolabdio.controllers.DAO.TratamentoDAO;
import projetolabdio.models.Pagamento;
import projetolabdio.models.Tratamento;

import java.util.ArrayList;

/**
 * Controller for Tratamento actions in TelaTratamento
 * @author Gabriel Siqueira
 * @since 07/11/2022
 * @version 1.0
 */
public class TratamentoController {
    /**
     * Consults the database (DAO Controllers) and get one Tratamento researched by id
     * @param id Primary key of "Tratamento" table
     * @return Researched tratamento object
     */
    public Tratamento getTratamento(int id){
        TratamentoDAO t = new TratamentoDAO();
        
        Tratamento trat = t.selectTratamentoPaciente(id); 
        
        return trat;
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
