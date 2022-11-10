package projetolabdio.models;

import java.util.Date;

/**
 * Model of Tratamento
 * @author Gabriel Siqueira
 * @since 10/11/22
 * @version 1.0
 */
public class Tratamento {
    // ATRB
    private int idTratamento;
    private float preco;
    private String descricao;
    private Date data;
    private String Paciente_cpf;

    /**
     * Constructor method from Tratamento
     * @param id Primary key of Tratamento
     * @param preco Attribute phone of Tratamento
     * @param descricao Attribute phone of Tratamento
     * @param data Attribute phone of Tratamento
     * @param paciente_cpf Foreing key for Paciente
     */
    public Tratamento(int id, float preco, String descricao, Date data, String paciente_cpf) { // CONSTRUCTOR
        this.idTratamento = id;
        this.preco = preco;
        this.descricao = descricao;
        this.data = data;
        this.Paciente_cpf = paciente_cpf;
    }

    /**
     * Getter of idTratamento
     * @return idTratamento
     */
    public int getId() {
        return idTratamento;
    }

    /**
     * Getter of preco
     * @return preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * Getter of descricao
     * @return descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Getter of data
     * @return data
     */
    public Date getData() {
        return data;
    }

    /**
     * Getter of Paciente_cpf
     * @return Paciente_cpf
     */
    public String getPaciente_cpf() {
        return Paciente_cpf;
    }
}
