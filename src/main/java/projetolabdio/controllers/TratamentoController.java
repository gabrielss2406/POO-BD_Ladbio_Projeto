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
import javax.swing.JOptionPane;
import projetolabdio.controllers.DAO.Medico_has_TratamentoDAO;
import projetolabdio.models.Medico_has_Tratamento;

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
    
    /**
     * Use the database (DAO Controllers) and register new Tratamento, related Pagamento and Medico_has_Tratamento
     * @param id Primary key of Tratamento and Foreign Key of Pagamento
     * @param cpf Value of Tratamento
     * @param preco Value of Tratamento
     * @param descricao Value of Tratamento
     * @param data Value of Tratamento
     * @param parcelas Value of Pagamento
     * @param forma Value of Pagamento
     * @param data2 Value of Pagamento
     * @param crm Primary key of related Medico
     * @return TRUE for successful login and FALSE for unsuccessful register
     */
    public boolean createTratamento(int id, String cpf, float preco, String descricao, String data, int parcelas, String forma, String data2, int crm){
        boolean sucess = false;
        
        if(!"Insira um id".equals(id) && !" ".equals(id)
                && !"Insira a descrição".equals(cpf) && !" ".equals(cpf)
                && !"Insira o preço".equals(preco) && !" ".equals(preco)
                && !"Insira a data (dd/mm/yyyy)".equals(data) && !" ".equals(data)
                && !"Insira a descrição".equals(descricao) && !" ".equals(descricao)
                && !"Insira a quantidade de parcelas".equals(parcelas) && !" ".equals(parcelas)
                && !"Insira a forma de pagamento".equals(forma) && !" ".equals(forma)
                && !"Insira a data (dd/mm/yyyy)".equals(data2) && !" ".equals(data2)){
            
                TratamentoDAO trat = new TratamentoDAO();
                Tratamento tratamento = new Tratamento(id, preco, descricao, data, cpf);

                sucess = trat.insertTratamento(tratamento);
                if(sucess){
                    PagamentoDAO pag = new PagamentoDAO();
                    Pagamento pagamento = new Pagamento(parcelas, forma, data2, false, id);
                    sucess = pag.insertPagamento(pagamento);
                    
                    if(sucess){
                        Medico_has_TratamentoDAO medhtrat = new Medico_has_TratamentoDAO();
                        Medico_has_Tratamento mht = new Medico_has_Tratamento(crm,id);
                        sucess = medhtrat.insertMedico_has_Tratamento(mht);
                    }
                }
        }
        else
            JOptionPane.showMessageDialog(null, "Insira todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
        
        return sucess;
    }
}
