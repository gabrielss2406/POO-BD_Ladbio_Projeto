package projetolabdio.models;

import java.util.Date;

/**
 * Model of Pagamento
 * @author Gabriel Siqueira
 * @since 10/11/22
 * @version 1.0
 */
public class Pagamento {
    // ATRB
    private int idPagamento;
    private int parcelas;
    private String forma;
    private Date data;
    private Boolean pago;
    private int Tratamento_idTratamento;

    /**
     * Constructor method from Pagamento
     * @param id Primary key of Pagamento
     * @param parcelas Attribute phone of Pagamento
     * @param forma Attribute phone of Pagamento
     * @param data Attribute phone of Pagamento
     * @param pago Attribute phone of Pagamento
     * @param tratamento_idTratamento Foreing key for Tratamento
     */
    public Pagamento(int id, int parcelas, String forma, Date data, Boolean pago, int tratamento_idTratamento) { // CONSTRUCTOR
        this.idPagamento = id;
        this.parcelas = parcelas;
        this.forma = forma;
        this.data = data;
        this.pago = pago;
        this.Tratamento_idTratamento = tratamento_idTratamento;
    }

    /**
     * Getter of idPagamento
     * @return idPagamento
     */
    public int getId() {
        return idPagamento;
    }

    /**
     * Getter of parcelas
     * @return parcelas
     */
    public int getParcelas() {
        return parcelas;
    }

    /**
     * Getter of forma
     * @return forma
     */
    public String getForma() {
        return forma;
    }

    /**
     * Getter of data
     * @return data
     */
    public Date getData() {
        return data;
    }

    /**
     * Getter of pago
     * @return pago
     */
    public Boolean getPago() {
        return pago;
    }

    /**
     * Getter of Tratamento_idTratamento
     * @return Tratamento_idTratamento
     */
    public int getTratamento_idTratamento() {
        return Tratamento_idTratamento;
    }
}
