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
public class Tratamento {
    // ATRB
    private int id;
    private float preco;
    private String descricao;
    private Date data;
    private String Paciente_cpf;

    // CONSTRUCTOR
    public Tratamento(int id, float preco, String descricao, Date data, String paciente_cpf) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.data = data;
        this.Paciente_cpf = paciente_cpf;
    }

    public int getId() {
        return id;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getData() {
        return data;
    }

    public String getPaciente_cpf() {
        return Paciente_cpf;
    }
}
