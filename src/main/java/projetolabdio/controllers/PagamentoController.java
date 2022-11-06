/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.controllers;

import projetolabdio.controllers.DAO.PagamentoDAO;
import projetolabdio.models.Pagamento;

/**
 *
 * @author Gabriel Siqueira
 */
public class PagamentoController {
    public Pagamento getPagamento(int id){
        PagamentoDAO p = new PagamentoDAO();
        
        Pagamento pagamento = p.selectPagamento(id);
    
        return pagamento;
    }
}
