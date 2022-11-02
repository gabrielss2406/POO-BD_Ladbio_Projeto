/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.models;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Pagamento {
    // ATRB
    private int id;
    private int parcelas;
    private String forma;
    private Date data;
    private Boolean pago;
    private int Tratamento_idTratamento;

    // CONSTRUCTOR
    public Pagamento(int id, int parcelas, String forma, Date data, Boolean pago, int tratamento_idTratamento) {
        this.id = id;
        this.parcelas = parcelas;
        this.forma = forma;
        this.data = data;
        this.pago = pago;
        this.Tratamento_idTratamento = tratamento_idTratamento;
    }

    public int getId() {
        return id;
    }

    public int getParcelas() {
        return parcelas;
    }

    public String getForma() {
        return forma;
    }

    public Date getData() {
        return data;
    }

    public Boolean getPago() {
        return pago;
    }

    public int getTratamento_idTratamento() {
        return Tratamento_idTratamento;
    }
}
