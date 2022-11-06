/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolabdio.controllers;

import java.util.ArrayList;
import projetolabdio.controllers.DAO.PacienteDAO;
import projetolabdio.models.Paciente;

/**
 * Controller for Medico actions in TelaMedico
 * @author Gabriel Siqueira
 * @since 05/11/2022
 * @version 1.0 
 */
public class MedicoController {
    
    /**
     * Consults the database (DAO Controllers) and get the list of all related Paciente a certain Medico
     * @return ArrayList of all Paciente, with name and cpf
     */
    public ArrayList<Paciente> getPacientesList(){
        PacienteDAO pac = new PacienteDAO();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        // Select pacientes
        pacientes = pac.selectPacientesList(Logged.getCrm());
        
        return pacientes;
    }
    
    /**
     * Consults the database (DAO Controllers) and get the list of one Paciete researched by cpf
     * @param cpf Primary key of Paciente table
     * @return Researched Paciente object
     */
    public Paciente getPaciente(String cpf){
        PacienteDAO pac = new PacienteDAO();
        
        // Select pacientes
        Paciente paciente = pac.selectPaciente(cpf);
        
        return paciente;
    }
}
