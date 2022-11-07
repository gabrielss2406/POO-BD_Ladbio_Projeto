/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.controllers;

import projetolabdio.controllers.DAO.PagamentoDAO;
import projetolabdio.models.Pagamento;

/**
 * Controller for Pagamento actions in TelaTratamento
 * @author Gabriel Siqueira
 * @since 07/11/2022
 * @version 1.0
 */
public class PagamentoController {
    /**
     * Consults the database (DAO Controllers) and get one Pagamento researched by id
     * @param id Primary key of "Pagamento" table
     * @return Researched pagamento object
     */
    public Pagamento getPagamento(int id){
        PagamentoDAO p = new PagamentoDAO();
        
        Pagamento pagamento = p.selectPagamento(id);
    
        return pagamento;
    }

    /**
     * Updates "pago" status for one Tratamente searched by id in the database using DAO Controllers
     * @param id Primary key of "Tratamento" table
     * @return TRUE for successful Update and FALSE for unsuccessful Update
     */
    public boolean updatePagamento(int id){
        PagamentoDAO pag = new PagamentoDAO();
        boolean req;

        req = pag.updatePagamento(id);

        return req;
    }
}
