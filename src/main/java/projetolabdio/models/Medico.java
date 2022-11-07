/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.models;

/**
 *
 * @author aluno
 */
public class Medico {
    // ATRB
    private int crm;
    private String nome;
    private String telefone;
    private String especialidade;
    private String senha;

    // CONSTRUCTOR
    public Medico(int crm, String nome, String telefone, String especialidade, String senha) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.senha = senha;
    }

    public int getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getSenha() {
        return senha;
    }
}
