/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.controllers;

import projetolabdio.controllers.DAO.TratamentoDAO;
import projetolabdio.models.Tratamento;

/**
 *
 * @author Gabriel Siqueira
 */
public class TratamentoController {
    
    public Tratamento getTratamento(int id){
        TratamentoDAO t = new TratamentoDAO();
        
        Tratamento trat = t.selectPaciente(id); 
        
        return trat;
    }
}
